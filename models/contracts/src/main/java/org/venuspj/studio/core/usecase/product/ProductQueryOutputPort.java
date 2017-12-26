package org.venuspj.studio.core.usecase.product;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.role.thingRole.product.Product;

/**
 * Created by mizoguchi on 2017/07/08.
 */
public interface ProductQueryOutputPort extends Response {
    void setProduct(Product product);
}
