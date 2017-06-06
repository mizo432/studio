package jp.or.venuspj.image.core.adapters.contorollers;

import jp.or.venuspj.image.core.fundamentals.path.Path;

import java.io.ByteArrayInputStream;

/**
 * Created by mizoguchi on 2017/06/02.
 */
public interface ImageCacheHelper {
    boolean enableCache();

    String getCacheKey(Path path);

    boolean existsCache(String key);

    Object get(String key);

    void put(String key, ByteArrayInputStream byteArrayInputStream);
}
