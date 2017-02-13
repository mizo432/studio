package jp.or.venuspj.colorUml.domain.model.description;

import jp.or.venuspj.colorUml.domain.model.Description;
import jp.or.venuspj.colorUml.domain.model.partyPlaceThing.Things;

public interface ThingDescription extends Description {

    Things findAvailable();

    public Things things();

}
