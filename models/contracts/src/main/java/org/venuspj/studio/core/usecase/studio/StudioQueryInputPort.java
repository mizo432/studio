package org.venuspj.studio.core.usecase.studio;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

public interface StudioQueryInputPort extends Request {

    PartyIdentifier getStudioIdentifier();

}
