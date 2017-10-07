package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnit;
import org.venuspj.studio.generic.model.role.partyRole.organizationRole.OrganizationRoleImpl;

import static org.venuspj.util.objects2.Objects2.*;

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
    protected ToStringHelper string() {
        return super.string()
                .add("studioInfo", studioInfo);

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
