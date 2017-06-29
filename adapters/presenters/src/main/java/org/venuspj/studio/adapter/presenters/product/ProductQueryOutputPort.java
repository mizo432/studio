package org.venuspj.studio.adapter.presenters.product;

import org.venuspj.cleanArchitecture.useCase.UseCaseOutputPort;

public class ProductQueryOutputPort implements UseCaseOutputPort {
    public static ProductQueryOutputPort defaultOutputPort() {
        return new ProductQueryOutputPort();
    }
}
