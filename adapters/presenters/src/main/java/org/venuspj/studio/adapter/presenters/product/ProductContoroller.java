package org.venuspj.studio.adapter.presenters.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.venuspj.studio.core.model.product.ProductId;
import org.venuspj.studio.core.model.studio.StudioCode;
import org.venuspj.studio.core.usecases.products.ProductQueryInputPort;
import org.venuspj.studio.core.usecases.products.ProductQueryOutputPort;
import org.venuspj.studio.core.usecases.products.ProductQuery;

public class ProductContoroller {

    ProductQuery productQuery;

    @Autowired
    public ProductContoroller(ProductQuery aShowProductUseCase) {
        productQuery = aShowProductUseCase;

    }

    public String get(Integer aProductId) {

        ProductQueryInputPort inputPort = ProductQueryInputPort.of(new ProductId(new StudioCode("LHS"), aProductId));

        ProductQueryOutputPort outputPort = productQuery.withInputPort(inputPort).start();

        return "";
    }
}
