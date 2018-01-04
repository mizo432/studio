package org.venuspj.studio.web.controller.product.requests;

import org.venuspj.studio.core.usecase.product.ProductQueryInputPort;
import org.venuspj.studio.generic.model.ppt.thing.ThingIdentifier;

public class ProductPageRequest implements ProductQueryInputPort {
    private final ThingIdentifier productIdentifier;

    public ProductPageRequest(Integer aValue) {
        productIdentifier = new ThingIdentifier(aValue);

    }

    @Override
    public ThingIdentifier getProductIdentifier() {
        return productIdentifier;
    }
}
