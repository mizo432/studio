package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifierCriteria;

public class OrganizationCriteria extends AbstractCriteria {
    private PartyIdentifierCriteria partyIdentifierCriteria = PartyIdentifierCriteria.create(this);

    public static OrganizationCriteria create() {
        return new OrganizationCriteria();
    }

    public PartyIdentifierCriteria getIdentifier() {
        return partyIdentifierCriteria;

    }
}
