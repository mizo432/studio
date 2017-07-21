package org.venuspj.studio.core.model.role.thingRole.product;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCode;
import org.venuspj.util.objects2.Objects2;

public class ProductId extends AbstractEntityIdentifier<Product> {
    Integer value;
    StudioCode studioCode = StudioCode.defaultCode();

    ProductId() {
        super(Product.class);
    }

    public ProductId(StudioCode aStudioCode, Integer aValue) {
        this();
        studioCode = aStudioCode;
        value = aValue;
    }

    public static ProductId defaultProductId() {
        return new ProductId();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("kind", kind)
                .add("value", value)
                .add("studioCode", studioCode)
                .omitNullValues()
                .toString();
    }
}
