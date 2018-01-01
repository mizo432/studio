package org.venuspj.studio.adapter.presenters.product;

import org.venuspj.cleanArchitecture.presentation.Presenter;
import org.venuspj.studio.core.model.role.thingRole.product.Product;
import org.venuspj.studio.core.usecase.product.FetchProductResponse;

public class ProductPagePresenter implements Presenter<ProductPage>, FetchProductResponse {

    private Product product;

    public static ProductPagePresenter defaultOutputPort() {
        return new ProductPagePresenter();
    }

    @Override
    public void setProduct(Product aProduct) {
        product = aProduct;

    }

    @Override
    public ProductPage createView() {
        return new ProductPage();
    }
}
