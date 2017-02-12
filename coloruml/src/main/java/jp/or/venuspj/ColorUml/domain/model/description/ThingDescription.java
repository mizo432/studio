package jp.or.venuspj.ColorUml.domain.model.description;

import jp.or.venuspj.ColorUml.domain.model.Description;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.Things;

public interface ThingDescription extends Description {

    Things findAvailable();

    public Things things();

}
