package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.ddd.model.criteria.AbstractEnumerableCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

public class ThingIdentifierCriteria extends AbstractEnumerableCriteria<ThingIdentifier> {

    ThingIdentifierCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static ThingIdentifierCriteria create(Criteria aParentCriteria) {
        return new ThingIdentifierCriteria(aParentCriteria);
    }
}
