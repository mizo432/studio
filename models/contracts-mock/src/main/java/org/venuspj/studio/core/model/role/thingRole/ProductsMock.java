package org.venuspj.studio.core.model.role.thingRole;

import org.venuspj.studio.core.model.role.thingRole.product.Product;
import org.venuspj.studio.core.model.role.thingRole.product.Products;

import java.util.Collection;

import static org.venuspj.util.collect.Lists2.*;

public class ProductsMock {
    public static Products createDummy(MockType aProductType) {
        Collection<Product> result = newArrayList();
        for (ProductMock.ProductType productMockType : aProductType.getMockTypes())
            result.add(ProductMock.createDummy(productMockType));

        return new Products(result);
    }

    public enum MockType {
        ALL;

        public ProductMock.ProductType[] getMockTypes() {
            return new ProductMock.ProductType[]{ProductMock.ProductType.PRODUCT1, ProductMock.ProductType.PRODUCT2};
        }
    }
}
