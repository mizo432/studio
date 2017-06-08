package jp.or.venuspj.studio.core.model.product;

import jp.or.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import jp.or.venuspj.util.objects2.Objects2;

/**
 *
 */
public class Product {
    ProductId productId = ProductId.defaultProductId();
    Descriptor descriptor = Descriptor.defaultDescriptor();

    Product(){

    }

    public Product(ProductId aProductId,Descriptor aDescriptor){
        productId = aProductId;
        descriptor = aDescriptor;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("productId",productId)
                .add("descriptor",descriptor)
                .omitNullValues()
                .toString();
    }
}
