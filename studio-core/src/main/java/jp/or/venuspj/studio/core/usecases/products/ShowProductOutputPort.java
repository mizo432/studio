package jp.or.venuspj.studio.core.usecases.products;

import jp.or.venuspj.studio.core.usecases.UseCaseOutputPort;

public class ShowProductOutputPort implements UseCaseOutputPort {
    public static ShowProductOutputPort defaultOutputPort() {
        return new ShowProductOutputPort();
    }
}
