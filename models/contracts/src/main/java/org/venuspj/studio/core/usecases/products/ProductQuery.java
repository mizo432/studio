package org.venuspj.studio.core.usecases.products;

import org.venuspj.cleanArchitecture.useCase.UseCaseInteractor;
import org.venuspj.studio.adapter.presenters.product.ProductQueryOutputPort;

public interface ProductQuery extends UseCaseInteractor<ProductQueryInputPort, ProductQueryOutputPort, ProductQuery> {
}
