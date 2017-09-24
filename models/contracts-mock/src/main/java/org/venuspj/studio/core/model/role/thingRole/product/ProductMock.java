package org.venuspj.studio.core.model.role.thingRole.product;

import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.event.flyers.DescriptorMock;

/**
 */
public class ProductMock {
    static Product createDummy(ProductType aProductType) {
        ProductId productId = ProductIdMock.createDummy(aProductType.productIdType());
        Descriptor descriptor = DescriptorMock.createDummy(aProductType.descriptorType());
        return new Product(productId, descriptor);

    }

    public enum ProductType {
        DEFAULT {
            @Override
            public ProductIdMock.ProductIdType productIdType() {
                return ProductIdMock.ProductIdType.DEFAULT;
            }

            @Override
            public DescriptorMock.DescriptorType descriptorType() {
                return DescriptorMock.DescriptorType.DEFAULT;
            }
        }, PRODUCT1 {
            @Override
            public ProductIdMock.ProductIdType productIdType() {
                return ProductIdMock.ProductIdType.PRODUCT1;
            }

            @Override
            public DescriptorMock.DescriptorType descriptorType() {
                return DescriptorMock.DescriptorType.ALBUM1;
            }
        }, PRODUCT2 {
            @Override
            public ProductIdMock.ProductIdType productIdType() {
                return ProductIdMock.ProductIdType.PRODUCT2;
            }

            @Override
            public DescriptorMock.DescriptorType descriptorType() {
                return DescriptorMock.DescriptorType.ALBUM2;
            }
        }, PRODUCT3 {
            @Override
            public ProductIdMock.ProductIdType productIdType() {
                return ProductIdMock.ProductIdType.PRODUCT3;
            }

            @Override
            public DescriptorMock.DescriptorType descriptorType() {
                return DescriptorMock.DescriptorType.ALBUM3;
            }
        };


        public abstract ProductIdMock.ProductIdType productIdType();

        public abstract DescriptorMock.DescriptorType descriptorType();
    }

}
