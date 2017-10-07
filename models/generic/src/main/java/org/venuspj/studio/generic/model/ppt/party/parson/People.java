package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;

public class People extends AbstractListValue<Person> {

    public People(Collection<? extends Person> anyList) {
        super(anyList);
    }

}
