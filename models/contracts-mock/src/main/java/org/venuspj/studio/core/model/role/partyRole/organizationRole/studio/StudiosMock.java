package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import static org.venuspj.util.collect.Lists2.*;

/**
 */
public class StudiosMock {
    public static Studios createDummy() {
        return new Studios(newArrayList(StudioMock.createDummy()));
    }


}
