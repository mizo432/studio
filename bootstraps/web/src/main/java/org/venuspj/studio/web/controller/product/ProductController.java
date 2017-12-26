package org.venuspj.studio.web.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.venuspj.studio.adapter.presenters.product.ProductPage;
import org.venuspj.studio.core.usecase.product.FetchProductUseCase;
import org.venuspj.studio.core.usecase.product.ProductQueryInputPort;

public class ProductController {

    FetchProductUseCase productQuery;

    @Autowired
    public ProductController(FetchProductUseCase aProductQuery) {
        productQuery = aProductQuery;

    }

    public String get(Integer aProductId) {

        ProductQueryInputPort inputPort = new ProductQueryInputPort() {
        };
//        ProductId(new StudioCode("LHS"), aProductId));

        ProductPage outputPort = new ProductPage();
        productQuery
                .withProductQueryOutputPort(outputPort)
                .withProductQueryInputPort(inputPort)

                .start();

        return "";
    }
}
