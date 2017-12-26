package org.venuspj.studio.core.usecase.product.products;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.role.thingRole.product.Products;

/**
 * Created by mizoguchi on 2017/07/08.
 */
public interface FetchProductsResponse extends Response {
    void setProducts(Products anyProducts);

}
