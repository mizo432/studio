package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile;

import org.venuspj.studio.core.fundamentals.note.NoteMock;

/**
 */
public class ProfileMock {
    public static Profile createDummy() {
        return new Profile(NoteMock.createDummy());
    }

}
