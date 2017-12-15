package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.criteria.AbstractConcreteCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

public class PartyIdentifierCriteria extends AbstractConcreteCriteria<PartyIdentifier> {

    public PartyIdentifierCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static PartyIdentifierCriteria create(Criteria aParentCriteria) {
        return new PartyIdentifierCriteria(aParentCriteria);

    }
}
