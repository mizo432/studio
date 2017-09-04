package org.venuspj.studio.generic.model.ppt;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.fundamentals.name.Name;

public class PartyPlaceThing<E extends PartyPlaceThing<E>> extends AbstractEntity<E> {

    private Name name;

    public PartyPlaceThing(EntityIdentifier<E> aIdentifier, Name aName) {
        super(aIdentifier);
        name = aName;
    }

    protected PartyPlaceThing() {

    }


    @Override
    public String toString() {
        return string()
                .add("name", name)
                .omitNullValues()
                .toString();
    }

}
