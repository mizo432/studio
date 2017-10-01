package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;

public class ThingImpl extends AbstractEntity<Thing> implements Thing {
    ThingId thingId;
    ThingInfo thingInfo;

    public ThingImpl(ThingId anIdentifier, ThingInfo aThingInfo) {
        super(anIdentifier);
        thingId = anIdentifier;
        thingInfo = aThingInfo;
    }

    public static Thing emptyThing() {
        return new ThingImpl(ThingId.emptyThingId(), ThingInfo.emptyThingInfo());
    }

    @Override
    protected Objects2.ToStringHelper string() {
        return toStringHelper(this)
                .add("thingId", thingId)
                .add("thingInfo", thingInfo);

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
