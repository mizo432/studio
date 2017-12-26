package org.venuspj.studio.core.model.role.thingRole.product;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;

public class Products extends AbstractListValue<Product> {
    public Products(Collection<Product> anyCollection) {
        super(anyCollection);
    }

    public Products() {

    }

    public static Products empty() {
        return new Products();
    }

}
