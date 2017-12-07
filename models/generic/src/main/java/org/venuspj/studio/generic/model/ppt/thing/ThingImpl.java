package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.ddd.model.entity.AbstractEntity;

public class ThingImpl extends AbstractEntity<Thing> implements Thing {
    protected ThingInformation thingInformation;

    public ThingImpl(ThingIdentifier anIdentifier, ThingInformation aThingInformation) {
        super(anIdentifier);
        thingInformation = aThingInformation;
    }

    public static Thing empty() {
        return new ThingImpl(ThingIdentifier.empty(), ThingInformation.empty());
    }

}
