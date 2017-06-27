package org.venuspj.studio.core.usecases.products;

import org.venuspj.studio.core.usecases.UseCaseOutputPort;

public class ProductQueryOutputPort implements UseCaseOutputPort {
    public static ProductQueryOutputPort defaultOutputPort() {
        return new ProductQueryOutputPort();
    }
}
