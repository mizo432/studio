package org.venuspj.studio.generic.model.role.placeRole;

import org.venuspj.studio.generic.model.ppt.thing.Thing;
import org.venuspj.studio.generic.model.role.RoleImpl;

public class PlaceRoleImpl extends RoleImpl implements PlaceRole {

    PlaceRoleImpl() {
        super();
    }

    public PlaceRoleImpl(Thing aThing, PlaceRoleInformation aPlaceRoleInformation) {
        super(aThing, aPlaceRoleInformation);
    }

    @Override
    public Thing clone() {
        return null;
    }

    protected Thing getThing() {
        return (Thing) super.getPartyPlaceThing();
    }

    protected PlaceRoleInformation getThingRoleInformation() {
        return (PlaceRoleInformation) super.getRoleInformation();

    }
}
