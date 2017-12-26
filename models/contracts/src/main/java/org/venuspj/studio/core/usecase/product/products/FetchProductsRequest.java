package org.venuspj.studio.core.usecase.product.products;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.core.model.role.thingRole.product.ProductCriteria;

public interface FetchProductsRequest extends Request {

    ProductCriteria getProductCriteria();

}
