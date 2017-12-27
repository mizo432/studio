package org.venuspj.studio.core.model.role.thingRole;

import org.venuspj.studio.core.model.role.thingRole.product.Product;
import org.venuspj.studio.core.model.role.thingRole.product.Products;

import java.util.Collection;

import static org.venuspj.util.collect.Lists2.*;

public class ProductsMock {
    public static Products createDummy(MockType aMockType) {
        Collection<Product> result = newArrayList();
        for (ProductMock.MockType productMockType : aMockType.getMockTypes())
            result.add(ProductMock.createDummy(productMockType));

        return new Products(result);
    }

    public enum MockType {
        ALL {
            @Override
            public ProductMock.MockType[] getMockTypes() {
                return new ProductMock.MockType[]{ProductMock.MockType.PRODUCT1, ProductMock.MockType.PRODUCT2, ProductMock.MockType.PRODUCT3, ProductMock.MockType.PRODUCT4};
            }
        };

        public abstract ProductMock.MockType[] getMockTypes();
    }
}
