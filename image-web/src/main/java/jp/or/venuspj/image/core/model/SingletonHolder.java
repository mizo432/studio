package jp.or.venuspj.image.core.model;

public interface SingletonHolder {

    public <T> T get(Class<T> clazz);

    public void set(Class<?> clazz, Object object);

    public void remove(Class<?> clazz);
}
