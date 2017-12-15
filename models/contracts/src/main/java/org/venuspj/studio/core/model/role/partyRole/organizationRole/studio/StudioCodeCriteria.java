package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

public class StudioCodeCriteria {
    public StudioCode getEqualStudioCode() {
        return equalStudioCode;
    }

    private StudioCode equalStudioCode;

    public void equal(StudioCode aStudioCode) {
        equalStudioCode = aStudioCode;
    }

    public static StudioCodeCriteria empty() {
        return new StudioCodeCriteria();
    }
}
