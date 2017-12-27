package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.util.collect.ComparisonChain;

import static org.venuspj.util.objects2.Objects2.*;

public class ThingIdentifier extends AbstractEntityIdentifier<Thing> implements Comparable<ThingIdentifier> {
    private final Integer value;

    ThingIdentifier() {
        super(Party.class);
        value = null;
    }

    public ThingIdentifier(Integer aValue) {
        super(Thing.class);
        value = aValue;
    }

    public static EntityIdentifier<Thing> newId() {
        return DefaultEntityIdentifier.newId(Thing.class);
    }

    public static ThingIdentifier empty() {
        return new ThingIdentifier();
    }

    @Override
    public boolean isEmpty() {
        return isNull(value);
    }

    @Override
    public int compareTo(ThingIdentifier o) {
        return ComparisonChain
                .start()
                .compare(value, o.value)
                .result();
    }
}
