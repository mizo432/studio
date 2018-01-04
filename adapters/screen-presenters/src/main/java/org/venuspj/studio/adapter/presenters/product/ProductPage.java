package org.venuspj.studio.adapter.presenters.product;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.view.player.PlayerViewModel;
import org.venuspj.studio.view.product.ProductViewModel;

import static org.venuspj.util.objects2.Objects2.nonNull;

public class ProductPage implements SpringView<ProductViewModel> {
    private static final String PRODUCT_PAGE_TEMPLATE = "/product";
    ProductViewModel productViewModel;
    PlayerViewModel playerViewModel;

    @Override
    public String getTemplatePath() {
        if (existsProduct())
            return PRODUCT_PAGE_TEMPLATE;

        return "/404";
    }

    @Override
    public SpringView<ProductViewModel> bind(Model model) {
        if (existsProduct()) {
            model.addAttribute("product", productViewModel);
            model.addAttribute("player", playerViewModel);
        }
        return this;
    }

    private boolean existsProduct() {
        return nonNull(productViewModel.getProductCode());
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
