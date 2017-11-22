package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile.Profile;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class StudioInfo {
    private final Profile profile;

    public StudioCode getStudioCode() {
        return studioCode;
    }

    private final StudioCode studioCode;

    StudioInfo() {
        profile = Profile.defaultProfile();
        studioCode = StudioCode.empty();
    }

    public StudioInfo(Profile aProfile, StudioCode aStudioCode) {
        profile = aProfile;
        studioCode = aStudioCode;

    }

    public Profile getProfile() {
        return profile;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addAllDeclaredFields()
                .multiLine()
                .omitNullValues()
                .toString();
    }

}
