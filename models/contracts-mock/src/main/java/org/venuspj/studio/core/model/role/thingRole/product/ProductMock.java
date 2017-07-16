package org.venuspj.studio.core.model.role.thingRole.product;

import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCode;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCodeMock;
import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.studio.generic.fundamentals.name.Name;

/**
 */
public class ProductMock {
    static Product createDummy(ProductType aProductType) {
        StudioCode studioCode = StudioCodeMock.createDummy();
        ProductId productId = ProductIdMock.createDummy(aProductType.productIdType());
        Name name = new Name("ALBUM_NAME");

        Description description = new Description("description");
        Descriptor descriptor = new Descriptor(name, description);
        return new Product(productId, descriptor);

    }

    public enum ProductType {
        DEFAULT {
            @Override
            public ProductIdMock.ProductIdType productIdType() {
                return ProductIdMock.ProductIdType.DEFAULT;
            }
        };

        public abstract ProductIdMock.ProductIdType productIdType();
    }

}
