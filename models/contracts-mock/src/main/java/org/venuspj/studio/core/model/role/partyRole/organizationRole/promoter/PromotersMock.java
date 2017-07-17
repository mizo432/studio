package org.venuspj.studio.core.model.role.partyRole.organizationRole.promoter;

import org.venuspj.util.collect.Lists2;

import java.util.List;

/**
 */
public class PromotersMock {
    public static Promoters createDummy(PromotersType aPromotersType) {
        List<Promoter> promoterList = Lists2.newArrayListWithExpectedSize(aPromotersType.promoterCount());
        for (PromoterMock.PromoterType promoterType : aPromotersType.promoterTypes()) {
            promoterList.add(PromoterMock.createDummy(promoterType));
        }
        return new Promoters(promoterList);
    }

    public enum PromotersType {
        DEFAULT {
            @Override
            public PromoterMock.PromoterType[] promoterTypes() {
                return new PromoterMock.PromoterType[]{PromoterMock.PromoterType.DEFAULT};
            }
        };

        public int promoterCount() {
            return promoterTypes().length;
        }

        public abstract PromoterMock.PromoterType[] promoterTypes();
    }
}
