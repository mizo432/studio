package org.venuspj.studio.core.usecases.products;

public interface ProductQueryUseCase {
    ProductQueryUseCase withProductQueryInputPort(ProductQueryInputPort inputPort);

    ProductQueryUseCase withProductQueryOutputPort(ProductQueryOutputPort outPort);

    void start();

}
