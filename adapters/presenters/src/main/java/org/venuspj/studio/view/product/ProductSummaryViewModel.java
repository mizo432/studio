package org.venuspj.studio.view.product;

import org.venuspj.studio.core.model.role.thingRole.product.Product;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

public class ProductSummaryViewModel {
    private String productName;

    public ProductSummaryViewModel(String aProductName) {
        productName = aProductName;
    }

    public String getProductName() {
        return productName;
    }

    public static class Builder extends ObjectBuilder<ProductSummaryViewModel, Builder> {

        private String productName;

        public Builder fromProduct(Product aProduct) {
            if (isNull(aProduct)) return getThis();
            withProductName(aProduct.getThingName());
            addConfigurator(builder -> builder.productName = aProduct.getThing().getThingInformaion().getName().asText());
            return getThis();
        }

        private Builder withProductName(Name aThingName) {
            return withProductName(aThingName.asText());
        }

        @Override
        protected void apply(ProductSummaryViewModel vo, Builder builder) {
            builder.withProductName(vo.getProductName());

        }

        public Builder withProductName(String aProductName) {
            if (isNull(aProductName)) return getThis();
            addConfigurator(builder -> builder.productName = aProductName);
            return getThis();
        }

        @Override
        protected ProductSummaryViewModel createValueObject() {
            return new ProductSummaryViewModel(productName);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }
    }
}
