package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.event.flyers.DescriptorMock;
import org.venuspj.studio.core.model.ppt.organization.Organization;
import org.venuspj.studio.core.model.ppt.organization.OrganizationId;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile.ProfileMock;
import org.venuspj.studio.generic.fundamentals.name.NameMock;
import org.venuspj.util.uuidProvider.UuidProvider;

/**
 */
public class StudioMock {
    public static Studio createDummy() {
        EntityIdentifier<Organization> anIdentifier = new OrganizationId(UuidProvider.randomUUID().toString());
        return new Studio(NameMock.createDummy(NameMock.NameType.STUDIO_NAME),
                StudioCodeMock.createDummy(),
                ProfileMock.createDummy(),
                DescriptorMock.createDummy(DescriptorMock.DescriptorType.STUDIO_DESCRIPTOR),
                new Organization(anIdentifier));
    }

}
