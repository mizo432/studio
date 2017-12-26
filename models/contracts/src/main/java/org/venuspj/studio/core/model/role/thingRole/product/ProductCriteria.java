package org.venuspj.studio.core.model.role.thingRole.product;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.studio.generic.model.ppt.thing.ThingIdentifierCriteria;

public class ProductCriteria extends AbstractCriteria {
    private ThingIdentifierCriteria thingIdentifier = ThingIdentifierCriteria.create(this);

}
