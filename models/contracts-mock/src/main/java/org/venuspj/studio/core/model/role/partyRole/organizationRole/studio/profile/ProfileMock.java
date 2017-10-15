package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile;

import org.venuspj.studio.generic.fundamentals.description.DescriptionMock;

/**
 */
public class ProfileMock {
    public static Profile createDummy() {
        return new Profile(DescriptionMock.createDummy(DescriptionMock.DescriptionType.STUDIO));
    }

}
