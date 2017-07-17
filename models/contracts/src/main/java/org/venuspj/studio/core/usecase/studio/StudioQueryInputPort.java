package org.venuspj.studio.core.usecase.studio;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;

public interface StudioQueryInputPort {

    EntityIdentifier<Studio> getStudioId();

}
