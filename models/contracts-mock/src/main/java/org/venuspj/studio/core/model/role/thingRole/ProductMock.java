package org.venuspj.studio.core.model.role.thingRole;

import org.venuspj.studio.core.model.role.thingRole.product.Product;
import org.venuspj.studio.generic.model.ppt.thing.ThingMock;

public class ProductMock {
    public static Product createDummy(MockType aMockType) {
        return new Product(ThingMock.createDummy(aMockType.getThingType()), null);
    }

    public enum MockType {
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
        }, PRODUCT3 {
            @Override
            public ThingMock.MockType getThingType() {
                return ThingMock.MockType.PRODUCT3;
            }
        }, PRODUCT4 {
            @Override
            public ThingMock.MockType getThingType() {
                return ThingMock.MockType.PRODUCT4;
            }
        };

        public abstract ThingMock.MockType getThingType();
    }
}
