package org.venuspj.ddd.model.value;

import org.venuspj.ddd.model.entity.Entity;

public interface DecidableSameIdentifierAs<E extends Entity<E>>  {
    boolean sameIdentifierAs(E other);
}
