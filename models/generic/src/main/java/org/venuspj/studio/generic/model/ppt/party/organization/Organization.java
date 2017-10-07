package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.Party;

public interface Organization extends Party {

    OrganizationInfo getInfo();

    OrganizationUnits getUnits();

}
