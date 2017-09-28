package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.util.objects2.Objects2;
import org.venuspj.util.uuidProvider.UuidProvider;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.isNull;
import static org.venuspj.util.objects2.Objects2.nonNull;

public class PartyId extends AbstractEntityIdentifier<Party> {
    private String value;

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

    public PartyId(String aValue) {
        this(Party.class, aValue);

    }

    public static PartyId empty() {
        return new PartyId();
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

    protected Objects2.ToStringHelper string() {
        return super.string()
                .add("value", value);
    }

    public boolean isPresent() {
        return nonNull(value);
    }

    public static EntityIdentifier<Party> newId() {
        return new PartyId(UuidProvider.randomUUID().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (isNull(o)) return false;
        if (this == o) return true;
        return o instanceof PartyId && super.equals(o) && equal(value, ((PartyId) o).value);
    }
}
