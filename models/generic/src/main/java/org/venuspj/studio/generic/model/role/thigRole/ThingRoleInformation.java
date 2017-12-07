package org.venuspj.studio.generic.model.role.thigRole;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.role.RoleInformation;

public class ThingRoleInformation extends RoleInformation {
    protected ThingRoleInformation(Name aRoleName) {
        super(aRoleName);
    }

    public static ThingRoleInformation empty(Name aRoleName) {
        return new ThingRoleInformation(aRoleName);
    }
}
