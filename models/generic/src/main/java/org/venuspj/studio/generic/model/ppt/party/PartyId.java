package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.util.objects2.Objects2;
import org.venuspj.util.uuidProvider.UuidProvider;

import java.util.UUID;

import static org.venuspj.util.objects2.Objects2.*;

public class PartyId<P extends Party<P>> extends AbstractEntityIdentifier<P> {
    protected String value;

    protected PartyId() {
        this(Party.class);

    }

    protected PartyId(Class<?> anEntityClass) {
        super(anEntityClass);

    }

    protected PartyId(Class<?> anEntityClass, String aValue) {
        super(anEntityClass);
        value = aValue;

    }

    public PartyId(UUID aValue) {
        this(Party.class, aValue.toString());

    }

    public PartyId(String aValue) {
        this(Party.class, aValue);

    }

    public static PartyId emptyPartyId() {
        return new PartyId();
    }

    public static PartyId newId() {
        return new PartyId(UuidProvider.randomUUID());
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

    @Override
    protected Objects2.ToStringHelper string() {
        return super.string()
                .add("value", value);
    }

    public boolean isPresent() {
        return nonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (isNull(o)) return false;
        if (this == o) return true;
        return o instanceof PartyId && super.equals(o) && equal(value, ((PartyId) o).value);
    }

    @Override
    public int hashCode() {
        return hash(kind, value);
    }
}
