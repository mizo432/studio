package org.venuspj.studio.generic.model.ppt.party.organization;

public class OrganizationInformationMock {
    public static OrganizationInformation createDummy(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        LHS;

        public OrganizationInformation create() {
            return OrganizationInformation.empty();
        }
    }
}
