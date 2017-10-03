package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.util.uuidProvider.UuidProvider;

import static org.venuspj.util.objects2.Objects2.*;

public class ThingId extends AbstractEntityIdentifier<Thing> {
    private String value;

    public ThingId(String aValue) {
        super(Thing.class);
        value = aValue;

    }

    public static ThingId newThingId() {
        return new ThingId(UuidProvider.randomUUID().toString());
    }

    public static ThingId emptyThingId() {
        return new ThingId(null);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("kind", kind)
                .add("value", value)
                .omitNullValues()
                .toString();
    }
}
