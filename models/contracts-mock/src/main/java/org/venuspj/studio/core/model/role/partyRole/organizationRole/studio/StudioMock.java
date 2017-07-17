package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.core.model.momentInterval.momemt.event.DescriptorMock;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile.ProfileMock;
import org.venuspj.studio.generic.fundamentals.name.NameMock;

/**
 */
public class StudioMock {
    public static Studio createDummy() {
        return new Studio(NameMock.createDummy(NameMock.NameType.STUDIO_NAME),
                StudioCodeMock.createDummy(),
                ProfileMock.createDummy(),
                DescriptorMock.createDummy(DescriptorMock.DescriptorType.STUDIO_DESCRIPTOR));
    }

}
