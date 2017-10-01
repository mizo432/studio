package org.venuspj.studio.generic.model.role.partyRole;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyId;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitImpl;

public abstract class PartyRoleImpl<P extends Party<P>> extends AbstractEntity<P> implements Party<P>, PartyRole<P> {

    private final Party party;

    public PartyRoleImpl() {
        this(OrganizationUnitImpl.emptyOrganizationUnit());
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
    public PartyId identifier() {
        return (PartyId) party.identifier();
    }

}
