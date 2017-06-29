package org.venuspj.studio.core.usecases.products;

import org.venuspj.studio.core.model.product.ProductId;
import org.venuspj.cleanArchitecture.useCase.UseCaseInputPort;

public class ProductQueryInputPort implements UseCaseInputPort {
    private ProductId productId;

    public ProductQueryInputPort(ProductId aProductId) {
        productId = aProductId;
    }

    public static ProductQueryInputPort of(ProductId aProductId) {
        return new ProductQueryInputPort(aProductId);
    }
}
