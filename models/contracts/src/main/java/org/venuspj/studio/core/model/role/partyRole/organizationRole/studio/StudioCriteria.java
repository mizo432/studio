package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

public class StudioCriteria {
    StudioCodeCriteria studioCodeCriteria = StudioCodeCriteria.empty();
    public static StudioCriteria empty() {
        return new StudioCriteria();
    }

    public StudioCodeCriteria getStudioCodeCriteria() {
        return studioCodeCriteria;

    }
}
