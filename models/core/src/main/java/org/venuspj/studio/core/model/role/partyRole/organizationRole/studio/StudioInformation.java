package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile.Profile;
import org.venuspj.studio.generic.model.role.partyRole.organizationRole.OrganizationRoleInformation;

public class StudioInformation extends OrganizationRoleInformation {
    private final Profile profile;
    private final StudioCode studioCode;

    StudioInformation() {
        profile = Profile.defaultProfile();
        studioCode = StudioCode.empty();
    }

    public StudioInformation(Profile aProfile, StudioCode aStudioCode) {
        profile = aProfile;
        studioCode = aStudioCode;

    }

    public StudioCode getStudioCode() {
        return studioCode;
    }

    public Profile getProfile() {
        return profile;
    }

    public static StudioInformation empty() {
        return new StudioInformation();
    }
}
