package org.venuspj.util.base;

public interface Supplier<T> extends java.util.function.Supplier<T> {
    @Override
    T get();
}
