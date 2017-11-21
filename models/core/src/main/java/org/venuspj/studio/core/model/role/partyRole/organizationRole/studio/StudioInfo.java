package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile.Profile;

import static org.venuspj.util.objects2.Objects2.*;

public class StudioInfo {
    private final Profile profile;

    StudioInfo() {
        profile = Profile.defaultProfile();
    }

    public StudioInfo(Profile aProfile) {
        profile = aProfile;

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
