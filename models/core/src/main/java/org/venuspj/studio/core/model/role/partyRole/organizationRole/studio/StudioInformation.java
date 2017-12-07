package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile.Profile;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.topic.Topics;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.role.partyRole.organizationRole.OrganizationRoleInformation;

public class StudioInformation extends OrganizationRoleInformation {
    private final Profile profile;
    private final StudioCode studioCode;
    private final Topics topics;

    StudioInformation() {
        super(new Name("STUDIO"));
        profile = Profile.defaultProfile();
        studioCode = StudioCode.empty();
        topics = Topics.empty();
    }

    public StudioInformation(Profile aProfile, StudioCode aStudioCode, Topics anyTopics) {
        super(new Name("STUDIO"));
        profile = aProfile;
        studioCode = aStudioCode;

        topics = anyTopics;
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
