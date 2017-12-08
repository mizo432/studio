package org.venuspj.studio.generic.model.role.placeRole;

import org.venuspj.studio.generic.model.ppt.place.Place;
import org.venuspj.studio.generic.model.role.RoleImpl;

public class PlaceRoleImpl extends RoleImpl implements PlaceRole {

    PlaceRoleImpl() {
        super();
    }

    public PlaceRoleImpl(Place aPlace, PlaceRoleInformation aPlaceRoleInformation) {
        super(aPlace, aPlaceRoleInformation);
    }

    @Override
    public PlaceRoleImpl clone() {
        return new PlaceRoleImpl(getPlace(),getThingRoleInformation());
    }

    protected Place getPlace() {
        return (Place) super.getPartyPlaceThing();
    }

    protected PlaceRoleInformation getThingRoleInformation() {
        return (PlaceRoleInformation) super.getRoleInformation();

    }
}
