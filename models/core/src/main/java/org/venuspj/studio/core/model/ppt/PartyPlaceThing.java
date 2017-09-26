package org.venuspj.studio.core.model.ppt;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;

/**
 * Party(人と組織の抽象化概念)
 */
public class PartyPlaceThing extends AbstractEntity<PartyPlaceThing> {

    public PartyPlaceThing(EntityIdentifier<PartyPlaceThing> anIdentifier) {
        super(anIdentifier);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
