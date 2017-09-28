package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.fundamentals.name.Name;

/**
 */
public class Party extends AbstractEntity<Party> {


    public Party(EntityIdentifier<Party> anIdentifier, Name aName) {
        super(anIdentifier);
    }
}
