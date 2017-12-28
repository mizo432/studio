package org.venuspj.studio.adapter.presenters.product;

import org.venuspj.studio.core.model.role.thingRole.product.Product;
import org.venuspj.studio.core.usecase.product.FetchProductResponse;

public class FetchProductPresenter implements FetchProductResponse {
    private Product product;

    public static FetchProductPresenter defaultOutputPort() {
        return new FetchProductPresenter();
    }

    @Override
    public void setProduct(Product aProduct) {
        product = aProduct;

    }
}
