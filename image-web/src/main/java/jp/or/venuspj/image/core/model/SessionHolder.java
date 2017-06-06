package jp.or.venuspj.image.core.model;

public interface SessionHolder {
    <T> T get(String key, Class<T> clazz);

    <T> void set(String key, T obj);

    <T> T remove(String key, Class<T> clazz);

    void invalidate(String key);
}
