package jp.or.venuspj.image.core.adapters.contorollers;

import org.apache.tomcat.util.net.DispatchType;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mizoguchi on 2017/06/02.
 */
public class RequestUtils {
    public static HttpServletRequest get() {
        return SingletonUtils.get(RequestHolder.class).get();
    }

    public static void set(HttpServletRequest request) {
        SingletonUtils.get(RequestHolder.class).set(request);
    }

    public static void remove() {
        SingletonUtils.get(RequestHolder.class).remove();
    }

    public static MobyletContext getMobyletContext() {
        HttpServletRequest request = get();
        if (request.getAttribute(MobyletContext.CONTEXT_KEY) == null) {
            request.setAttribute(
                    MobyletContext.CONTEXT_KEY,
                    new MobyletContext());
            return getMobyletContext();
        } else {
            return (MobyletContext)request.getAttribute(MobyletContext.CONTEXT_KEY);
        }
    }

    public static String getUserAgent() {
        return getUserAgent(get());
    }

    public static String getUserAgent(HttpServletRequest request) {
        return request.getHeader("User-Agent");
    }

    public static boolean isIncludeScope() {
        return RequestUtils.getMobyletContext().get(DispatchType.class) ==
                DispatchType.INCLUDE_OR_FORWARD;
    }}
