package org.venuspj.studio.generic.model.role.partyRole;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.DefaultParty;
import org.venuspj.studio.generic.model.ppt.party.Party;

public abstract class PartyRoleImpl implements Party, PartyRole {

    protected final Party party;

    public PartyRoleImpl() {
        this(DefaultParty.emptyParty());
    }

    /**
     * コンストラクター
     *
     * @param aParty
     */
    public PartyRoleImpl(Party aParty) {
        party = aParty;
    }

    @Override
    public EntityIdentifier<Party> identifier() {
        return party.identifier();
    }

    @Override
    public Party clone() {
        Party b = new DefaultPartyRole(party);

        /*ObjectクラスのcloneメソッドはCloneNotSupportedExceptionを投げる可能性があるので、try-catch文で記述(呼び出し元に投げても良い)*/
        try {
            b = (Party) super.clone(); //親クラスのcloneメソッドを呼び出す(親クラスの型で返ってくるので、自分自身の型でのキャストを忘れないようにする)
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;

    }


    private static class DefaultPartyRole extends PartyRoleImpl {
        public DefaultPartyRole(Party aParty) {
            super(aParty);
        }
    }
}
