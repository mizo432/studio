package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile;

import org.venuspj.studio.generic.fundamentals.description.Description;

/**
 */
public class Profile {

    private final Description description;

    Profile() {
        description = Description.empty();

    }

    public Profile(Description aDescription) {
        description = aDescription;

    }

    public static Profile defaultProfile() {
        return new Profile();
    }

    public Description getDescription() {
        return description;
    }

}
