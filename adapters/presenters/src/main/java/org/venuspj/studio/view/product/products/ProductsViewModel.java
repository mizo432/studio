package org.venuspj.studio.view.product.products;

import org.venuspj.ddd.model.value.AbstractListValue;
import org.venuspj.studio.core.model.role.thingRole.product.Product;
import org.venuspj.studio.core.model.role.thingRole.product.Products;
import org.venuspj.studio.view.product.ProductSummaryViewModel;
import org.venuspj.util.builder.ObjectBuilder;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

public class ProductsViewModel extends AbstractListValue<ProductSummaryViewModel> {

    public ProductsViewModel(Collection<ProductSummaryViewModel> anyProducts) {
        super(anyProducts);
    }

    public static class Builder extends ObjectBuilder<ProductsViewModel, Builder> {
        private List<ProductSummaryViewModel> list = newArrayList();

        @Override
        protected void apply(ProductsViewModel vo, Builder builder) {

        }

        @Override
        protected ProductsViewModel createValueObject() {
            return new ProductsViewModel(list);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return null;
        }

        public Builder fromProducts(Products anyProducts) {
            if (isNull(anyProducts)) return getThis();
            addConfigurator(builder -> {
                for (Product product : anyProducts)
                    builder.list.add(new ProductSummaryViewModel
                            .Builder()
                            .fromProduct(product)
                            .build());
            });
            return getThis();
        }
    }
}
