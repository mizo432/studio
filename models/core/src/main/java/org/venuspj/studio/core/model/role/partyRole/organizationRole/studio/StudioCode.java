package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.ddd.model.value.StringValue;

public class StudioCode implements StringValue {
    private String value;

    public StudioCode(String aValue) {
        value = aValue;
    }

    private StudioCode() {

    }

    @Override
    public String asText() {
        return value;
    }

    public static StudioCode empty() {
        return new StudioCode();
    }
}
