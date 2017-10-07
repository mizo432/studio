package org.venuspj.studio.generic.model.role.partyRole.organizationRole;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnit;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitImpl;
import org.venuspj.studio.generic.model.role.partyRole.PartyRoleImpl;

public abstract class OrganizationRoleImpl extends PartyRoleImpl implements OrganizationUnit, OrganizationRole {
    protected final OrganizationUnit organizationUnit;

    protected OrganizationRoleImpl() {
        this(OrganizationUnitImpl.emptyOrganizationUnit());
    }

    protected OrganizationRoleImpl(OrganizationUnit anOrganizationUnit) {
        super(anOrganizationUnit);
        organizationUnit = anOrganizationUnit;
    }

    @Override
    public EntityIdentifier<Party> identifier() {
        return organizationUnit.identifier();
    }

    public OrganizationUnit getOrganizationUnit() {
        return organizationUnit;
    }

    @Override
    public Party clone() {
        Party b = new OrganizationRoleImpl() {
        };

        try {
            b = (Party) super.clone(); //親クラスのcloneメソッドを呼び出す(親クラスの型で返ってくるので、自分自身の型でのキャストを忘れないようにする)
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

}
