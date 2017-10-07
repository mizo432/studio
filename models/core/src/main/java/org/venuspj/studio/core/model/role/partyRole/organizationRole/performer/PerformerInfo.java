package org.venuspj.studio.core.model.role.partyRole.organizationRole.performer;

import static org.venuspj.util.objects2.Objects2.*;

public class PerformerInfo {
    private PerformerInfo() {

    }

    public static PerformerInfo emptyPerformerInfo() {
        return new PerformerInfo();
    }

    @Override
    public String toString() {
        return toStringHelper(this)
//                .add("performerInfo",performerInfo)
                .omitNullValues()
                .toString();
    }
}
