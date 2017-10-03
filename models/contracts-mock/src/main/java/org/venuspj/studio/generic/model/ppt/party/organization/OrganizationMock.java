package org.venuspj.studio.generic.model.ppt.party.organization;

public class OrganizationMock {
    public static Organization createDimmy() {
        return new OrganizationImpl(
                OrganizationId.newOrganizationId(),
                OrganizationInfo.emptyOrganizationInfo(),
                OrganizationUnits.emptyOrganizationUnits()
        );
    }
}
