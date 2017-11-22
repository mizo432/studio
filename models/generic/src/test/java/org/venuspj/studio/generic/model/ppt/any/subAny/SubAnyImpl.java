package org.venuspj.studio.generic.model.ppt.any.subAny;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.any.AnyImpl;

public class SubAnyImpl<SA extends SubAny<SA>> extends AnyImpl<SA> implements SubAny<SA>, Entity<SA> {

    public <ID extends EntityIdentifier<SA>> SubAnyImpl(ID anIdentifier) {
        super(anIdentifier);
    }
}
