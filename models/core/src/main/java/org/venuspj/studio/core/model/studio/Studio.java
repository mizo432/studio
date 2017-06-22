package org.venuspj.studio.core.model.studio;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.fundamentals.name.Name;
import org.venuspj.studio.core.model.studio.profile.Profile;

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
