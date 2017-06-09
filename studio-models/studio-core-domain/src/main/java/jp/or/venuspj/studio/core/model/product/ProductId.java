package jp.or.venuspj.studio.core.model.product;

public class ProductId {
    Integer value;
    ProductId(){}
    public ProductId(Integer aValue) {
        value = aValue;
    }

    public static ProductId defaultProductId() {
        return new ProductId();
    }
}
