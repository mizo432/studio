package org.venuspj.util.collect;

import java.util.Collection;

public final class Collections3 {

    static <T> Collection<T> cast(Iterable<T> iterable) {
        return (Collection<T>) iterable;
    }

}
