package org.venuspj.ddd.model.entity;

import com.google.common.base.MoreObjects;
import org.venuspj.util.objects2.Objects2;

/**
 *
 */
public abstract class AbstractEntity<T extends Entity<T>> implements Entity<T> {

    private EntityIdentifier<T> identifier;

    protected AbstractEntity() {

    }

    protected AbstractEntity(EntityIdentifier<T> identifier) {
        this.identifier = identifier;
    }

    @Override
    public EntityIdentifier<T> getIdentifier() {
        return identifier;
    }

    @Override
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
        return identifier.equals(((Entity) that).getIdentifier());
    }

    protected MoreObjects.ToStringHelper string() {
        return Objects2
                .toStringHelper(this)
                .add("identifier", identifier);
    }
}
