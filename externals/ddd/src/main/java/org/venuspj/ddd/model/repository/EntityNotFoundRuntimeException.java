package org.venuspj.ddd.model.repository;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;

/**
 * 指定された識別子を持つエンティティが見つからなかった場合にスローされる例外
 */
public class EntityNotFoundRuntimeException extends RuntimeException {
    EntityIdentifier<?> identifier;

    public <T extends Entity<T>> EntityNotFoundRuntimeException(EntityIdentifier<?> identifier) {
        super("Entity not found. identifier:" + identifier);
    }

    EntityIdentifier<?> identifier() {
        return identifier;
    }
}
