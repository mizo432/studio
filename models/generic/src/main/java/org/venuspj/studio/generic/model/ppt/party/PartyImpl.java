package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationImpl;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

/**
 */
public abstract class PartyImpl<P extends Party<P>> extends AbstractEntity<P> {

    private final PartyInfo partyInfo;

    @SuppressWarnings("unchecked")
    public PartyImpl(PartyId anIdentifier, Name aName, PartyInfo aPartyInfo) {
        super(anIdentifier);
        partyInfo = aPartyInfo;
    }

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

    public static Party<?> emptyParty() {
        return OrganizationImpl.emptyOrganization();
    }

}
