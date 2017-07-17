package org.venuspj.studio.core.model.role.partyRole.organizationRole.promoter;

/**
 */
public class PromoterMock {
    public static Promoter createDummy(PromoterType aPromoterType) {
        return new Promoter(PromoterIdMock.createDummy(PromoterIdMock.PromoterIdType.DEFAULT));
    }

    public enum PromoterType {
        DEFAULT

    }
}
