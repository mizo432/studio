package org.venuspj.studio.generic.model.ppt;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.util.objects2.Objects2;

import java.util.UUID;

public class PartyPlaceThingId<E extends PartyPlaceThing<E>> extends AbstractEntityIdentifier<E> {

    String value;

    PartyPlaceThingId() {
        super(PartyPlaceThing.class);

    }

    protected PartyPlaceThingId(Class<?> anEntityClass) {
        super(anEntityClass);

    }

    protected PartyPlaceThingId(Class<?> anEntityClass, String aValue) {
        super(anEntityClass);
        value = aValue;

    }

    public PartyPlaceThingId(String aValue) {
        super(PartyPlaceThing.class);
        value = aValue;

    }

    public static PartyPlaceThingId newId() {
        return new PartyPlaceThingId(UUID.randomUUID().toString());
    }

    public static PartyPlaceThingId empty() {
        return new PartyPlaceThingId();
    }

    @Override
    public Objects2.ToStringHelper string() {
        return super.string()
                .add("kind", kind)
                .add("value", value);
    }


    @Override
    public String toString() {
        return string()
                .toString();
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }
}
