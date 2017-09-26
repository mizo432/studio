package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.ppt.party.organization.Organization;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile.Profile;
import org.venuspj.studio.generic.fundamentals.name.Name;

public class Studio extends AbstractEntity<Studio> {
    Descriptor descriptor;
    Name name = Name.defaultName();
    Profile profile = Profile.defaultProfile();
    Organization organization;

    Studio() {
        super(StudioCode.defaultCode());

    }

    public Studio(Name aName, EntityIdentifier<Studio> aStudioCode, Profile aProfile, Descriptor aDescriptor,Organization anOrganization) {
        super(aStudioCode);
        name = aName;
        profile = aProfile;
        descriptor = aDescriptor;
        organization = anOrganization;

    }

    @Override
    public String toString() {
        return string()
                .add("name", name)
                .add("profile", profile)
                .add("descriptor", descriptor)
                .add("organization", organization)
                .omitNullValues()
                .toString();
    }

    public Name getName() {
        return name;
    }

    public Profile getProfile() {
        return profile;
    }

    public Descriptor getDescriptor() {
        return descriptor;
    }
}
