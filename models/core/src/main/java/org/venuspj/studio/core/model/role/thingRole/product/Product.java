package org.venuspj.studio.core.model.role.thingRole.product;

import org.venuspj.studio.generic.model.ppt.thing.Thing;
import org.venuspj.studio.generic.model.ppt.thing.ThingImpl;
import org.venuspj.studio.generic.model.role.thigRole.ThingRoleImpl;

import static org.venuspj.util.objects2.Objects2.*;

public class Product extends ThingRoleImpl {
    public Product(Thing aThing) {
        super(aThing);
    }

    public static Product emptyProduct() {
        return new Product(ThingImpl.emptyThing());
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("thing", super.thing)
                .omitNullValues()
                .toString();
    }
}
