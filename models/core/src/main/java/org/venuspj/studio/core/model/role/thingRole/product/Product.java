package org.venuspj.studio.core.model.role.thingRole.product;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.util.objects2.Objects2;

/**
 *
 */
public class Product extends AbstractEntity<Product> {
    Descriptor descriptor = Descriptor.defaultDescriptor();

    Product() {

    }

    public Product(ProductId aProductId, Descriptor aDescriptor) {
        super(aProductId);
        descriptor = aDescriptor;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("identifier", identifier())
                .add("descriptor", descriptor)
                .omitNullValues()
                .toString();
    }
}
