package org.venuspj.studio.core.model.ppt.organization;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;

public class Organization extends AbstractEntity<Organization> {

    public Organization(EntityIdentifier<Organization> anIdentifier) {
        super(anIdentifier);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
