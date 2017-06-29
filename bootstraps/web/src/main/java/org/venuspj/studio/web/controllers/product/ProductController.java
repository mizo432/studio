package org.venuspj.studio.web.controllers.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.venuspj.studio.adapter.presenters.product.ProductQueryOutputPort;
import org.venuspj.studio.core.model.product.ProductId;
import org.venuspj.studio.core.model.studio.StudioCode;
import org.venuspj.studio.core.usecases.products.ProductQueryInputPort;
import org.venuspj.studio.core.usecases.products.ProductQuery;

public class ProductController {

    ProductQuery productQuery;

    @Autowired
    public ProductController(ProductQuery aProductQuery) {
        productQuery = aProductQuery;

    }

    public String get(Integer aProductId) {

        ProductQueryInputPort inputPort = ProductQueryInputPort.of(new ProductId(new StudioCode("LHS"), aProductId));

        ProductQueryOutputPort outputPort =
                productQuery
                        .withInputPort(inputPort)
                        .start();

        return "";
    }
}
