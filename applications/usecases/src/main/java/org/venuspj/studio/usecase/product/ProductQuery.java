package org.venuspj.studio.usecase.product;

import org.springframework.stereotype.Service;
import org.venuspj.studio.core.usecases.products.ProductQueryInputPort;
import org.venuspj.studio.core.usecases.products.ProductQueryOutputPort;
import org.venuspj.studio.core.usecases.products.ProductQueryUseCase;

@Service
public class ProductQuery implements ProductQueryUseCase {

    @Override
    public ProductQueryUseCase withProductQueryInputPort(ProductQueryInputPort inputPort) {
        return this;
    }

    @Override
    public ProductQueryUseCase withProductQueryOutputPort(ProductQueryOutputPort outPort) {
        return this;
    }

    @Override
    public void start() {

    }
}
