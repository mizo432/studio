package org.venuspj.studio.core.model.role.partyRole.organizationRole.promoter;

/**
 * Created by mizoguchi on 2017/07/17.
 */
public class PromoterIdMock {
    public static PromoterId createDummy(PromoterIdType aPromoterIdType) {
        return new PromoterId(aPromoterIdType.value());
    }

    public enum PromoterIdType {
        DEFAULT {
            @Override
            public Integer value() {
                return 1;
            }
        };

        public abstract Integer value();
    }
}
