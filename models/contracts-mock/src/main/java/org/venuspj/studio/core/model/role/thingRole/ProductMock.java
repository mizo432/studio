package org.venuspj.studio.core.model.role.thingRole;

import org.venuspj.studio.core.model.role.thingRole.product.Product;
import org.venuspj.studio.generic.model.ppt.thing.ThingMock;

public class ProductMock {
    public static Product createDummy(ProductType aProductType) {
        return new Product(ThingMock.createDummy(aProductType.getThingType()), null);
    }

    public enum ProductType {
        PRODUCT1 {
            @Override
            public ThingMock.MockType getThingType() {
                return ThingMock.MockType.PRODUCT1;
            }
        }, PRODUCT2 {
            @Override
            public ThingMock.MockType getThingType() {
                return ThingMock.MockType.PRODUCT2;
            }
        };

        public abstract ThingMock.MockType getThingType();
    }
}
