package org.venuspj.util.collect;

import java.util.Collection;
import java.util.Iterator;

import static org.venuspj.util.base.Preconditions.checkNotNull;

public final class Iterators {
    public static <T> boolean addAll(Collection<T> addTo, Iterator<? extends T> iterator) {
        checkNotNull(addTo);
        checkNotNull(iterator);
        boolean wasModified = false;
        while (iterator.hasNext()) {
            wasModified |= addTo.add(iterator.next());
        }
        return wasModified;
    }
}
