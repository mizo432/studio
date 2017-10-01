package org.venuspj.studio.core.model.role.thingRole;

import org.venuspj.studio.core.model.role.thingRole.product.Product;
import org.venuspj.studio.generic.model.ppt.thing.ThingMock;

public class ProductMock {
    public static Product createDummy(ProductType aProductType) {
        return new Product(ThingMock.createDummy(aProductType.ThingType()));
    }

    public enum ProductType {
        PRODUCT1 {
            @Override
            public ThingMock.ThingType ThingType() {
                return ThingMock.ThingType.PRPDUCT1;
            }
        }, PRODUCT2 {
            @Override
            public ThingMock.ThingType ThingType() {
                return ThingMock.ThingType.PRPDUCT2;
            }
        };

        public abstract ThingMock.ThingType ThingType();
    }
}
