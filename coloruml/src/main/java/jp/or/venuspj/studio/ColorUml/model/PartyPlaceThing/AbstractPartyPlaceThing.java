package jp.or.venuspj.studio.ColorUml.model.PartyPlaceThing;

import jp.or.venuspj.studio.ColorUml.model.Description;
import jp.or.venuspj.studio.ColorUml.model.Ppt;
import jp.or.venuspj.studio.ColorUml.model.Roles;

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
