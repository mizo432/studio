package org.venuspj.studio.core.usecase.player;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

public interface FetchPlayerRequest extends Request {
    PartyIdentifier getPlayerIdentifier();
}
