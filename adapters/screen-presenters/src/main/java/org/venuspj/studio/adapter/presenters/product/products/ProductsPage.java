package org.venuspj.studio.adapter.presenters.product.products;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.view.product.products.ProductsViewModel;

public class ProductsPage implements SpringView<ProductsViewModel> {
    private static final String PRODUCTS_PAGE_TEMPLATE = "/products";

    @Override
    public String getTemplatePath() {
        return PRODUCTS_PAGE_TEMPLATE;
    }

    @Override
    public SpringView<ProductsViewModel> bind(Model aModel) {
        return null;
    }

    @Override
    public View<ProductsViewModel> setViewModel(ProductsViewModel aViewModel) {
        return null;
    }
}
