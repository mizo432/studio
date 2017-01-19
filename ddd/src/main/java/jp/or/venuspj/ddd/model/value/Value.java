package jp.or.venuspj.ddd.model.value;

public interface Value<T extends Value<T>> {
    boolean sameValueAs(T other);
}
