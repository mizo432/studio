package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile;

import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class Profile {

    private final Description description;

    Profile() {
        description = Description.emptyDescription();

    }

    public Profile(Description aDescription) {
        description = aDescription;

    }

    public static Profile defaultProfile() {
        return new Profile();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("description", description)
                .omitNullValues()
                .toString();

    }
}
