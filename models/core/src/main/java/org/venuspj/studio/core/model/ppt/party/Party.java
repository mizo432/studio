package org.venuspj.studio.core.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;

public class Party  extends AbstractEntity<Party> {

    public Party(EntityIdentifier<Party> anIdentifier) {
        super(anIdentifier);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
