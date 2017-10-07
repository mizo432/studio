package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationImpl;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;

/**
 */
public abstract class PartyImpl extends AbstractEntity<Party> {

    private PartyInfo partyInfo = PartyInfo.emptyPartyInfo();

    @SuppressWarnings("unchecked")
    public PartyImpl(EntityIdentifier<Party> anIdentifier, PartyInfo aPartyInfo) {
        super(anIdentifier);
        partyInfo = aPartyInfo;
    }

    public static Party emptyParty() {
        return OrganizationImpl.emptyOrganization();
    }

    @Override
    protected Objects2.ToStringHelper string() {
        return toStringHelper(this)
                .add("identifier", identifier())
                .add("partyInfo", partyInfo);

    }

    @Override
    public String toString() {
        return this.string()
                .omitNullValues()
                .toString();
    }

}
