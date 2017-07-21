package org.venuspj.ddd.model.entity;

import org.venuspj.util.objects2.Objects2;

/**
 * エンティティの抽象クラス
 *
 * @param <T> エンティティクラス
 */
public abstract class AbstractEntity<T extends Entity<T>> implements Entity<T> {

    private EntityIdentifier<T> identifier;

    protected AbstractEntity() {

    }

    protected AbstractEntity(EntityIdentifier<T> identifier) {
        this.identifier = identifier;
    }

    @Override
    public EntityIdentifier<T> identifier() {
        return identifier;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T clone() {
        try {
            return (T) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error("clone not supported");
        }
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null || that instanceof Entity == false) {
            return false;
        }
        return identifier.equals(((Entity) that).identifier());
    }

    protected Objects2.ToStringHelper string() {
        return Objects2
                .toStringHelper(this)
                .add("identifier", identifier);
    }
}
