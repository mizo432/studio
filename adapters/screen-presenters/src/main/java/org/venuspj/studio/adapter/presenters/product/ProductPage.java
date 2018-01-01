package org.venuspj.studio.adapter.presenters.product;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.view.player.PlayerViewModel;
import org.venuspj.studio.view.product.ProductViewModel;

public class ProductPage implements SpringView<ProductViewModel> {
    private static final String PRODUCT_PAGE_TEMPLATE = "/product";
    ProductViewModel productViewModel;
    PlayerViewModel playerViewModel;

    @Override
    public String getTemplatePath() {
        return PRODUCT_PAGE_TEMPLATE;
    }

    @Override
    public SpringView<ProductViewModel> bind(Model model) {
        model.addAttribute("product", productViewModel);
        model.addAttribute("player", playerViewModel);
        return this;
    }

    @Override
    public View<ProductViewModel> setViewModel(ProductViewModel aViewModel) {
        productViewModel = aViewModel;
        return this;
    }

    public View<ProductViewModel> setViewModel(PlayerViewModel aViewModel) {
        playerViewModel = aViewModel;
        return this;
    }
}
