package jp.or.venuspj.studio.core.usecases.products;

import jp.or.venuspj.studio.core.model.product.ProductId;
import jp.or.venuspj.studio.core.usecases.UseCaseInputPort;

public class ShowProductInputPort implements UseCaseInputPort {
    private ProductId productId;

    public ShowProductInputPort(ProductId aProductId) {
        productId = aProductId;
    }

    public static ShowProductInputPort of(ProductId aProductId) {
        return new ShowProductInputPort(aProductId);
    }
}