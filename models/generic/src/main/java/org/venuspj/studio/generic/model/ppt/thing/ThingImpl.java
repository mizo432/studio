package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.studio.generic.model.ppt.PartyPlaceThingImpl;

public class ThingImpl extends PartyPlaceThingImpl<Thing> implements Thing {

    public ThingImpl(ThingIdentifier anIdentifier, ThingInformation aThingInformation) {
        super(anIdentifier,aThingInformation);
    }

    public static Thing empty() {
        return new ThingImpl(ThingIdentifier.empty(), ThingInformation.empty());
    }

}
