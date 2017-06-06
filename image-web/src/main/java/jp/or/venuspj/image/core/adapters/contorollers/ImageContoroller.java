package jp.or.venuspj.image.core.adapters.contorollers;

import jp.or.venuspj.image.core.config.ImageConfig;
import jp.or.venuspj.image.core.fundamentals.path.Path;
import jp.or.venuspj.image.core.model.ConnectionStream;
import jp.or.venuspj.image.core.model.ImageCodec;
import jp.or.venuspj.image.core.model.ImageReader;
import jp.or.venuspj.image.core.model.ImageScaleChanger;
import jp.or.venuspj.util.strings2.Strings2;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 */
public class ImageContoroller {
    private static final long serialVersionUID = -8330083988206718597L;

    @Autowired
    private ImageConfig config;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //GetPath
        Path path = config.path();

        //DoScale
        doScale(path, false, req, resp);
    }

    protected void doScale(Path path, boolean isReplace,
                           HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        if (path.isEmpty()) {
            return;
        }
        //GetImageCodec
        ImageCodec codec = ImageUtils.getImageCodec(path);
        //Helpers
        ImageReader imageReader = null; // = SingletonUtils.get(ImageReader.class);
        ImageScaleChanger imageScaler; // = SingletonUtils.get(ImageScaler.class);
        ImageCacheHelper cacheHelper = null;// = SingletonUtils.get(ImageCacheHelper.class);
        boolean enableCache = cacheHelper.enableCache();
        //---------------------------------------------------------------------
        // Read-Image
        //---------------------------------------------------------------------
        //ConvertPath
        path = imageReader.constructPath(path);
        //ImageInputStream
        ConnectionStream imageConnectionStream;
        OutputStream outStream = null;
        //CacheKey
        String key = null;
        //EnableCache
        if (enableCache) {
            //GetKey
            key = cacheHelper.getCacheKey(path);
            //ExsistsCache
            if (cacheHelper.existsCache(key)) {
                //ReturnCacheImage
                imageConnectionStream =
                        new ConnectionStream(null, cacheHelper.get(key)) {
                            @Override
                            public InputStream getInputStream() {
                                return null;
                            }
                        };
                byte[] imageBytes =
                        InputStreamUtils.getAllBytes(
                                imageConnectionStream.getInputStream());
                //ReCompute Codec
                codec = ImageUtils.getImageCodec(imageBytes);
                RequestUtils.getMobyletContext().set(new Ready());
                resp.setContentType(ImageUtils.getContentTypeString(codec));
                resp.setContentLength(imageBytes.length);
                resp.getOutputStream().write(imageBytes);
                resp.flushBuffer();
                return;
            }
            //NotExistsCache
            else {
                imageConnectionStream = imageReader.getStream(path);
            }
            if (imageConnectionStream != null) {
                //ReComputeCodec
                codec = getComputeCodec(codec, imageConnectionStream);
                outStream = new ByteArrayOutputStream(4096);
            }
        }
        //UnEnableCache
        else {
            imageConnectionStream = imageReader.getStream(path);
            if (imageConnectionStream != null) {
//                RequestUtils.getMobyletContext().set(new Ready());
                codec = getComputeCodec(codec, imageConnectionStream);
//                outStream = new MobyletServletOutputStream(resp.getOutputStream());
            }
        }
        //---------------------------------------------------------------------
        // Check-Stream
        //---------------------------------------------------------------------
        if (imageConnectionStream == null) {
            if (!isReplace) {
                String replace404path = config.getReplace404();
                if (Strings2.isNotEmpty(replace404path)) {
                    doScale(replace404path, true, req, resp);
                }
            } else {
                resp.setContentType(ImageUtils.getContentTypeString(codec));
                resp.sendError(HttpServletResponse.SC_NOT_FOUND);
            }
            return;
        }
        //---------------------------------------------------------------------
        // Set-ContentType
        //---------------------------------------------------------------------
        RequestUtils.getMobyletContext().set(new Ready());
        resp.setContentType(ImageUtils.getContentTypeString(codec));
        //---------------------------------------------------------------------
        // Convert-Image
        //---------------------------------------------------------------------
        imageScaler.scale(
                imageConnectionStream.getInputStream(),
                outStream,
                codec,
                ImageUtils.getScaledWidth(),
                ImageUtils.getScaleType());
        //closeConnection
        if (imageConnectionStream.getConnection() != null) {
            imageConnectionStream.getConnection().disconnect();
        }
        //---------------------------------------------------------------------
        // WriteResponse
        //---------------------------------------------------------------------
        byte[] imageBytes = null;
        if (outStream instanceof ByteArrayOutputStream) {
            imageBytes =
                    ByteArrayOutputStream.class.cast(outStream).toByteArray();
            if (imageBytes != null) {
                resp.setContentLength(imageBytes.length);
                resp.getOutputStream().write(imageBytes);
            }
            resp.flushBuffer();
            // WriteCache
            if (enableCache &&
                    imageBytes != null &&
                    Strings2.isNotEmpty(key)) {
                cacheHelper.put(key, new ByteArrayInputStream(imageBytes));
            }
        } else if (outStream instanceof MobyletServletOutputStream) {
            MobyletServletOutputStream msos =
                    MobyletServletOutputStream.class.cast(outStream);
            resp.setContentLength(msos.getLength());
            resp.flushBuffer();
        }
    }

    protected ImageCodec getComputeCodec(ImageCodec codec, ConnectionStream connectionStream) {
        if (codec == null) {
            codec = ImageUtils.getImageCodec(connectionStream);
            //Force Setting. #Deprecated Process
            if (codec == null) {
                codec = ImageCodec.JPG;
            }
        }
        return codec;
    }

}
