package org.venuspj.studio.core.model.ppt.organization;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

public class OrganizationId extends AbstractEntityIdentifier<Organization> {
    private String value;

    OrganizationId() {
        super(Organization.class);

    }

    public OrganizationId(String aValue) {
        super(Organization.class);
        value = aValue;

    }

    @Override
    public String toString() {
        return string()
                .addValue(value)
                .omitNullValues()
                .toString();
    }

}
