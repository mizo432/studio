package org.venuspj.studio.core.model.role.partyRole.organizationRole.promoter;

import org.venuspj.util.objects2.Objects2;

public class Promoter {

    PromoterId promoterId;
    public Promoter(){

    }

    public Promoter(PromoterId aPromoterId){
        promoterId = aPromoterId;

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("promoterId", promoterId)
                .toString();
    }

}
