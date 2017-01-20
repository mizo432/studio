package jp.or.venuspj.ddd.model.value;

import jp.or.venuspj.ddd.model.entity.Entity;

public interface DecidableSameIdentifierAs<E extends Entity<E>>  {
    boolean sameIdentifierAs(E other);
}
