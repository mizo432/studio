package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnit;
import org.venuspj.studio.generic.model.role.partyRole.organizationRole.OrganizationRoleImpl;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Studio extends OrganizationRoleImpl {

    private final StudioInfo studioInfo;

    public Studio(OrganizationUnit anOrganization, StudioInfo aStudioInfo) {
        super(anOrganization);
        studioInfo = aStudioInfo;

    }

    @Override
    public Party clone() {
        Studio studio = new Studio(organizationUnit, studioInfo);
        try {
            studio = (Studio) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studio;
    }


    @Override
    public String toString() {
        return toStringHelper(this)
                .addAllDeclaredFields()
                .multiLine()
                .omitNullValues()
                .toString();
    }

    public StudioInfo getStudioInfo() {
        return studioInfo;
    }
}
