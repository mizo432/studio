package jp.or.venuspj.ColorUml.domain.model.partyPlaceThing;

import jp.or.venuspj.ColorUml.domain.model.Description;
import jp.or.venuspj.ColorUml.domain.model.Ppt;
import jp.or.venuspj.ColorUml.domain.model.Roles;

/**
 */
public abstract class AbstractPartyPlaceThing<PPT extends AbstractPartyPlaceThing<PPT>> implements Ppt<PPT> {
    Roles roles;
    Description description;

    protected AbstractPartyPlaceThing() {

    }

    public AbstractPartyPlaceThing(Roles roles,
                            Description description) {

    }

}
