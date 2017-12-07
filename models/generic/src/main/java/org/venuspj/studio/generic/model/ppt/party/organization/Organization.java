package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.Party;

public interface Organization extends Party {

    OrganizationInformation getOrganizationInformation();

    OrganizationUnits getUnits();

}
