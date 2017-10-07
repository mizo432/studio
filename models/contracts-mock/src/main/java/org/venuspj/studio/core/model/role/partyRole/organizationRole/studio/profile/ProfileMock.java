package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile;

import org.venuspj.studio.core.model.event.flyers.DescriptionMock;

/**
 */
public class ProfileMock {
    public static Profile createDummy() {
        return new Profile(DescriptionMock.createDummy(DescriptionMock.DescriptionType.STUDIO));
    }

}
