package org.venuspj.studio.generic.model.role.thigRole;

import org.venuspj.studio.generic.model.ppt.thing.Thing;
import org.venuspj.studio.generic.model.role.RoleImpl;

public class ThingRoleImpl extends RoleImpl implements ThingRole {

    ThingRoleImpl() {
        super();
    }

    public ThingRoleImpl(Thing aThing, ThingRoleInformation aThingRoleInformation) {
        super(aThing, aThingRoleInformation);
    }

    @Override
    public Thing clone() {
        return null;
    }

    protected Thing getThing() {
        return (Thing) super.getPartyPlaceThing();
    }

    protected ThingRoleInformation getThingRoleInformation() {
        return (ThingRoleInformation) super.getRoleInformation();

    }
}
