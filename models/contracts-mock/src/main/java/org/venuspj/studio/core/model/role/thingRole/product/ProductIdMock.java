package org.venuspj.studio.core.model.role.thingRole.product;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCodeMock;

/**
 * Created by mizoguchi on 2017/07/16.
 */
public class ProductIdMock {
    static ProductId createDummy(ProductIdType aProductIdType) {
        return new ProductId(StudioCodeMock.createDummy(), aProductIdType.value());

    }

    public static enum ProductIdType {
        DEFAULT {
            @Override
            public Integer value() {
                return 1;
            }
        };

        public abstract Integer value();
    }
}
