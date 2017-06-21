package org.venuspj.ddd.model.value;

public interface DecidableSameValueAs<P extends Value> {
    boolean sameValueAs(P other);
}
