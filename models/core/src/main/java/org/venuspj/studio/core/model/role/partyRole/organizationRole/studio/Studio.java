package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile.Profile;
import org.venuspj.studio.generic.fundamentals.name.Name;

public class Studio extends AbstractEntity<Studio> {
    Descriptor descriptor;
    Name name = Name.defaultName();
    Profile profile = Profile.defaultProfile();

    Studio() {
        super(StudioCode.defaultCode());

    }

    public Studio(Name aName, StudioCode aStudioCode, Profile aProfile, Descriptor aDescriptor) {
        super(aStudioCode);
        name = aName;
        profile = aProfile;
        descriptor = aDescriptor;

    }

    @Override
    public String toString() {
        return string()
                .add("name", name)
                .add("profile", profile)
                .add("descriptor", descriptor)
                .omitNullValues()
                .toString();
    }

}
