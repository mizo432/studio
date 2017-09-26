package org.venuspj.studio.core.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.util.objects2.Objects2;

public class PartyId extends AbstractEntityIdentifier<Party> {


    protected final String value;

    public PartyId(String aValue) {
        super(Party.class);
        value = aValue;

    }

    @Override
    protected Objects2.ToStringHelper string() {
        super.string()
                .add("value", value);
        return null;
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
