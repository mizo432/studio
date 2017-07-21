package org.venuspj.studio.adapter.presenters.product;

import org.venuspj.studio.core.usecase.products.ProductQueryOutputPort;

public class ProductPage implements ProductQueryOutputPort {
    public static ProductPage defaultOutputPort() {
        return new ProductPage();
    }
}
