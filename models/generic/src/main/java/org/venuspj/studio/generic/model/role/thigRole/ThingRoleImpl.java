package org.venuspj.studio.generic.model.role.thigRole;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.generic.model.ppt.thing.Thing;
import org.venuspj.studio.generic.model.ppt.thing.ThingId;
import org.venuspj.studio.generic.model.ppt.thing.ThingImpl;

public class ThingRoleImpl extends AbstractEntity<Thing> implements Thing, ThingRole {
    protected final Thing thing;

    ThingRoleImpl() {
        super();
        thing = ThingImpl.emptyThing();
    }

    public ThingRoleImpl(Thing aThing) {
        super(aThing.identifier());
        thing = aThing;
    }

    @Override
    public ThingId identifier() {
        return (ThingId) thing.identifier();
    }

}
