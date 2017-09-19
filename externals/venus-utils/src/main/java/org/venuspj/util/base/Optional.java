package org.venuspj.util.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.venuspj.util.base.Preconditions.checkNotNull;

public abstract class Optional<T> implements Serializable {
    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> of(T reference) {
        return new Present<T>(checkNotNull(reference));
    }

    public static <T> Optional<T> fromNullable(T nullableReference) {
        return (nullableReference == null)
                ? Optional.<T>absent()
                : new Present<T>(nullableReference);
    }

    public static <T> Optional<T> fromJavaUtil(java.util.Optional<T> javaUtilOptional) {
        return (javaUtilOptional == null) ? null : fromNullable(javaUtilOptional.orElse(null));
    }

    public static <T> java.util.Optional<T> toJavaUtil(Optional<T> googleOptional) {
        return googleOptional == null ? null : googleOptional.toJavaUtil();
    }

    Optional() {}

    public abstract boolean isPresent();

    public abstract T get();

    public abstract T or(T defaultValue);

    public abstract Optional<T> or(Optional<? extends T> secondChoice);

    public abstract T or(Supplier<? extends T> supplier);

    public abstract T orNull();

    public abstract Set<T> asSet();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);

    public java.util.Optional<T> toJavaUtil() {
        return java.util.Optional.ofNullable(orNull());
    }

    @Override
    public abstract boolean equals(Object object);

    @Override
    public abstract int hashCode();

    @Override
    public abstract String toString();

    public static <T> Iterable<T> presentInstances(
            final Iterable<? extends Optional<? extends T>> optionals) {
        checkNotNull(optionals);
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new AbstractIterator<T>() {
                    private final Iterator<? extends Optional<? extends T>> iterator =
                            checkNotNull(optionals.iterator());

                    @Override
                    protected T computeNext() {
                        while (iterator.hasNext()) {
                            Optional<? extends T> optional = iterator.next();
                            if (optional.isPresent()) {
                                return optional.get();
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

}