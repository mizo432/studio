package org.venuspj.studio.web.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.venuspj.studio.adapter.presenters.product.ProductPagePresenter;
import org.venuspj.studio.core.usecase.product.FetchProductUseCase;
import org.venuspj.studio.web.controller.product.requests.ProductPageRequest;

public class ProductController {

    FetchProductUseCase fetchProductUseCase;

    @Autowired
    public ProductController(FetchProductUseCase aFetchProductUseCase) {
        fetchProductUseCase = aFetchProductUseCase;

    }

    public String get(Integer aProductId, Model model) {

        ProductPageRequest request = new ProductPageRequest(aProductId);

        ProductPagePresenter outputPort = new ProductPagePresenter();

        fetchProductUseCase.execute(request, outputPort);

        return outputPort
                .createView()
                .bind(model)
                .getTemplatePath();

    }
}
