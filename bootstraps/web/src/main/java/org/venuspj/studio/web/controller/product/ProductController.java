package org.venuspj.studio.web.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.venuspj.studio.adapter.presenters.product.FetchProductPresenter;
import org.venuspj.studio.core.usecase.product.FetchProductUseCase;
import org.venuspj.studio.core.usecase.product.ProductQueryInputPort;
import org.venuspj.studio.generic.model.ppt.thing.ThingIdentifier;

public class ProductController {

    FetchProductUseCase productQuery;

    @Autowired
    public ProductController(FetchProductUseCase aProductQuery) {
        productQuery = aProductQuery;

    }

    public String get(Integer aProductId) {

        ProductQueryInputPort inputPort = new ProductQueryInputPort() {
            @Override
            public ThingIdentifier getProductIdentifier() {
                return ThingIdentifier.empty();
            }
        };
//        ProductId(new StudioCode("LHS"), aProductId));

        FetchProductPresenter outputPort = new FetchProductPresenter();
        productQuery.execute(inputPort, outputPort);

        return "";
    }
}
