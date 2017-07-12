package org.venuspj.util.collections3;

import java.util.Collection;

/**
 * Created by mizoguchi on 2017/07/13.
 */
public final class Collections3 {
    public static <T> Collection<T> cast(Iterable<T> iterable) {
        return (Collection<T>) iterable;
    }
}
