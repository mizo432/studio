package org.venuspj.studio.core.usecase.studio;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;

public interface StudioQueryInputPort {

    EntityIdentifier<Party> getStudioId();

}
