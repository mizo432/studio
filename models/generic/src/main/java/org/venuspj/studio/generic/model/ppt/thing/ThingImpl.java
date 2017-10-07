package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;

public class ThingImpl extends AbstractEntity<Thing> implements Thing {
    ThingInfo thingInfo;

    public ThingImpl(EntityIdentifier<Thing> anIdentifier, ThingInfo aThingInfo) {
        super(anIdentifier);
        thingInfo = aThingInfo;
    }

    public static Thing emptyThing() {
        return new ThingImpl(ThingId.emptyThingId(), ThingInfo.emptyThingInfo());
    }

    @Override
    protected Objects2.ToStringHelper string() {
        return toStringHelper(this)
                .add("thingId", identifier())
                .add("thingInfo", thingInfo);

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
