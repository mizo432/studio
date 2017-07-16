package org.venuspj.studio.core.usecase.products;

public interface ProductQueryUseCase {
    ProductQueryUseCase withProductQueryInputPort(ProductQueryInputPort inputPort);

    ProductQueryUseCase withProductQueryOutputPort(ProductQueryOutputPort outPort);

    void start();

}
