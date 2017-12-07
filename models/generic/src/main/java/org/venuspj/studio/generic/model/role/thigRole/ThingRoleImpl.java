package org.venuspj.studio.generic.model.role.thigRole;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.thing.Thing;
import org.venuspj.studio.generic.model.ppt.thing.ThingImpl;

public class ThingRoleImpl extends AbstractEntity<Thing> implements Thing, ThingRole {
    protected final Thing thing;

    ThingRoleImpl() {
        super();
        thing = ThingImpl.empty();
    }

    public ThingRoleImpl(Thing aThing) {
        super(aThing.identifier());
        thing = aThing;
    }

    @Override
    public EntityIdentifier<Thing> identifier() {
        return thing.identifier();
    }

}
