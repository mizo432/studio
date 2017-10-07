package org.venuspj.studio.core.model.role.partyRole.organizationRole.performer;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class PerformersMock {
    public static Performers createDummy(PerformersType aPerformersType) {
        PerformerMock.PerformerType[] performerTypes = aPerformersType.getPerformerTypes();
        List<Performer> result = newArrayList();
        for (PerformerMock.PerformerType performerType : performerTypes)
            result.add(PerformerMock.createDummy(performerType));
        return new Performers(result);
    }

    public enum PerformersType {
        EMPTY;

        public PerformerMock.PerformerType[] getPerformerTypes() {
            return new PerformerMock.PerformerType[]{};
        }
    }

}
