package org.venuspj.studio.generic.model.ppt.any.subAny.subSubAny;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.any.subAny.SubAnyImpl;

public class SubSubAnyImpl extends SubAnyImpl<SubSubAny> implements SubSubAny, Entity<SubSubAny> {

    public <ID extends EntityIdentifier<SubSubAny>> SubSubAnyImpl(ID anIdentifier) {
        super(anIdentifier);
    }

}
