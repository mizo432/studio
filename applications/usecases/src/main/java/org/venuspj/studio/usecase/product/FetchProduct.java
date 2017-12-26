package org.venuspj.studio.usecase.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.role.thingRole.product.Product;
import org.venuspj.studio.core.model.role.thingRole.product.ProductRepository;
import org.venuspj.studio.core.usecase.product.FetchProductUseCase;
import org.venuspj.studio.core.usecase.product.ProductQueryInputPort;
import org.venuspj.studio.core.usecase.product.ProductQueryOutputPort;
import org.venuspj.studio.generic.model.ppt.thing.ThingIdentifier;

@Service
public class FetchProduct implements FetchProductUseCase {
    ProductRepository productRepository;

    @Autowired
    FetchProduct(ProductRepository aProductRepository) {
        productRepository = aProductRepository;
    }

    @Override
    public void execute(ProductQueryInputPort request, ProductQueryOutputPort response) {
        ThingIdentifier productIdentifier = request.getProductIdentifier();

        Product product = productRepository.resolve(productIdentifier);

        response.setProduct(product);

    }
}
