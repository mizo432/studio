package org.venuspj.studio.usecase.product;

import org.springframework.stereotype.Service;
import org.venuspj.studio.adapter.presenters.product.ProductQueryOutputPort;
import org.venuspj.studio.core.usecases.products.ProductQuery;
import org.venuspj.studio.core.usecases.products.ProductQueryInputPort;

@Service
public class ProductQueryImpl implements ProductQuery {

    @Override
    public ProductQuery withInputPort(ProductQueryInputPort anUseCaseInputPort) {
        return null;
    }

    @Override
    public ProductQueryOutputPort start() {
        return null;
    }
}
