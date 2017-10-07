package org.venuspj.studio.core.model.role.partyRole.organizationRole.performer;

public class PerformerInfoMock {
    public static PerformerInfo createDummy(PerformerInfoType aPerformerInfoType) {
        return aPerformerInfoType.getPerformerInfo();
    }

    public enum PerformerInfoType {
        DUMMY, DEEJEY1_EVENT1;

        public PerformerInfo getPerformerInfo() {
            return PerformerInfo.emptyPerformerInfo();
        }
    }
}
