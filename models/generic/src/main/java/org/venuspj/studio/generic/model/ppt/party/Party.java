package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.PartyPlaceThing;
import org.venuspj.studio.generic.model.ppt.PartyPlaceThingId;

/**
 */
public class Party extends PartyPlaceThing {
    public Party(PartyPlaceThingId aPersonPlaceThingId, Name aName) {
        super(aPersonPlaceThingId, aName);
    }

    protected Party() {

    }
}
