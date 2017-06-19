package jp.or.venuspj.studio.core.model.product;

import jp.or.venuspj.studio.core.model.studio.StudioCode;
import jp.or.venuspj.util.objects2.Objects2;

public class ProductId {
    Integer value;
    StudioCode studioCode = StudioCode.defaultCode();

    ProductId() {
    }

    public ProductId(StudioCode aStudioCode, Integer aValue) {
        studioCode = aStudioCode;
        value = aValue;
    }

    public static ProductId defaultProductId() {
        return new ProductId();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .add("studioCode", studioCode)
                .omitNullValues()
                .toString();
    }
}
