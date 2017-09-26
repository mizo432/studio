package org.venuspj.studio.core.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.util.objects2.Objects2;

public class Party extends AbstractEntity<Party> {

    private final Name name;

    public Party(EntityIdentifier<Party> anIdentifier, Name aName) {
        super(anIdentifier);
        name = aName;
    }

    @Override
    protected Objects2.ToStringHelper string() {
        return super.string()
                .add("name", name);

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
