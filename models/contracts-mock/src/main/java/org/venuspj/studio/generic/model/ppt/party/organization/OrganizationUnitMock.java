package org.venuspj.studio.generic.model.ppt.party.organization;

public class OrganizationUnitMock {
    public static OrganizationUnit createDimmy(OrganizationUnitType anOrganizationUnitType) {

        return new OrganizationUnitImpl(
                anOrganizationUnitType.getOrganizationUnitId(),
                anOrganizationUnitType.unitInfo(),
                anOrganizationUnitType.organization(),
                anOrganizationUnitType.largeUnits(),
                anOrganizationUnitType.smallUnits()

        );
    }

    public enum OrganizationUnitType {

        EMPTY {
            @Override
            public OrganizationUnitId getOrganizationUnitId() {
                return OrganizationUnitId.newOrganizationUnitId();
            }

            @Override
            public OrganizationUnitInfo unitInfo() {
                return OrganizationUnitInfo.emptyUnitInfo();
            }

            @Override
            public Organization organization() {
                return OrganizationMock.createDimmy();
            }

            @Override
            public OrganizationUnits largeUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }

            @Override
            public OrganizationUnits smallUnits() {
                return OrganizationUnits.emptyOrganizationUnits();
            }
        };

        public abstract OrganizationUnitId getOrganizationUnitId();

        public abstract OrganizationUnitInfo unitInfo();

        public abstract Organization organization();

        public abstract OrganizationUnits largeUnits();

        public abstract OrganizationUnits smallUnits();
    }
}
