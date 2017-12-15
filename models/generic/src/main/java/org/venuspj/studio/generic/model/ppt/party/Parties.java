package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;

public class Parties extends AbstractListValue<Party> {
    Parties(Collection<? extends Party> anyCollection) {
        super(anyCollection);
    }
}
