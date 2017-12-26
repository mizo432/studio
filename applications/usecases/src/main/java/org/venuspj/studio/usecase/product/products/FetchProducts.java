package org.venuspj.studio.usecase.product.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.role.thingRole.product.ProductCriteria;
import org.venuspj.studio.core.model.role.thingRole.product.ProductRepository;
import org.venuspj.studio.core.model.role.thingRole.product.Products;
import org.venuspj.studio.core.usecase.product.products.FetchProductsRequest;
import org.venuspj.studio.core.usecase.product.products.FetchProductsResponse;
import org.venuspj.studio.core.usecase.product.products.FetchProductsUseCase;

@Service
public class FetchProducts implements FetchProductsUseCase {

    private ProductRepository productRepository;

    @Autowired
    public FetchProducts(ProductRepository aProductRepository) {
        productRepository = aProductRepository;
    }

    @Override
    public void execute(FetchProductsRequest request, FetchProductsResponse response) {
        ProductCriteria productCriteria = request.getProductCriteria();
        Products products = productRepository.resolveEntities(productCriteria);
        response.setProducts(products);

    }
}
