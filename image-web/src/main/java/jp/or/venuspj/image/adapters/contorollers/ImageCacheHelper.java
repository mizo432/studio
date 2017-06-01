package jp.or.venuspj.image.adapters.contorollers;

import java.io.ByteArrayInputStream;

/**
 * Created by mizoguchi on 2017/06/02.
 */
public interface ImageCacheHelper {
    boolean enableCache();

    String getCacheKey(String path);

    boolean existsCache(String key);

    Object get(String key);

    void put(String key, ByteArrayInputStream byteArrayInputStream);
}
