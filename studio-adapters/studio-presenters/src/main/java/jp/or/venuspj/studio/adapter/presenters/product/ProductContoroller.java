package jp.or.venuspj.studio.adapter.presenters.product;

import jp.or.venuspj.studio.core.model.product.ProductId;
import jp.or.venuspj.studio.core.model.studio.StudioCode;
import jp.or.venuspj.studio.core.usecases.products.ShowProductInputPort;
import jp.or.venuspj.studio.core.usecases.products.ShowProductOutputPort;
import jp.or.venuspj.studio.core.usecases.products.ShowProductUseCase;

public class ProductContoroller {
    ShowProductUseCase showProductUseCase;

    public ProductContoroller(ShowProductUseCase aShowProductUseCase) {
        showProductUseCase = aShowProductUseCase;

    }

    public String get(Integer aProductId) {
        ShowProductInputPort inputPort = ShowProductInputPort.of(new ProductId(new StudioCode("LHS"), aProductId));
        ShowProductOutputPort outputPort = ShowProductOutputPort.defaultOutputPort();
        showProductUseCase.withInputPort(inputPort, outputPort).start();
        return "";
    }
}
