package org.venuspj.studio.core.model.role.thingRole.product;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.thing.Thing;
import org.venuspj.studio.generic.model.ppt.thing.ThingImpl;
import org.venuspj.studio.generic.model.role.thigRole.ThingRoleImpl;
import org.venuspj.studio.generic.model.role.thigRole.ThingRoleInformation;

public class Product extends ThingRoleImpl {
    public Product(Thing aThing, ThingRoleInformation aThingRoleInformation) {
        super(aThing,aThingRoleInformation);
    }

    public static Product empty() {
        return new Product(ThingImpl.empty(),ThingRoleInformation.empty(new Name("Product")));
    }

}
