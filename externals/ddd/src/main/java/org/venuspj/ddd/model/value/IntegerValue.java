package org.venuspj.ddd.model.value;

public interface IntegerValue<T extends IntegerValue<T>> extends ValueObject {
    Integer asInteger();

    String asText();

    boolean sameValueAs(T other);

}
