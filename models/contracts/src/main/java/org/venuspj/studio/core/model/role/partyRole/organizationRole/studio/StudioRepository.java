package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.ddd.model.repository.RoleCrudRepository;
import org.venuspj.studio.generic.model.ppt.party.Party;

public interface StudioRepository  extends RoleCrudRepository<Studio, Party> {

    Studios resolve(StudioCriteria StudioCriteria);

}
