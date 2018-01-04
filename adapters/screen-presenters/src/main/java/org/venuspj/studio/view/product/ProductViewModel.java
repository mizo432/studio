package org.venuspj.studio.view.product;

import org.venuspj.studio.core.model.role.thingRole.product.Product;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.isNull;

public class ProductViewModel {
    private String productCode;

    ProductViewModel(String aProductCode) {
        productCode = aProductCode;

    }

    public String getProductCode() {
        return productCode;

    }

    public static class Builder extends ObjectBuilder<ProductViewModel, Builder> {
        private String productCode;

        @Override
        protected void apply(ProductViewModel vo, Builder aBuilder) {
            aBuilder.withProductCode(vo.productCode);

        }

        public Builder withProductCode(String aProductCode) {
            if (isNull(aProductCode)) return getThis();
            addConfigurator(builder -> builder.productCode = aProductCode);
            return getThis();
        }

        @Override
        protected ProductViewModel createValueObject() {
            return new ProductViewModel(productCode);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }

        public Builder fromProduct(Product aProduct) {
            if (isNull(aProduct)) return getThis();
            addConfigurator(builder -> {
            });
            return getThis();

        }
    }
}
