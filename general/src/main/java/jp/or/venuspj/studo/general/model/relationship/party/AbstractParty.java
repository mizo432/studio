package jp.or.venuspj.studo.general.model.relationship.party;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.studo.general.model.relationship.AbstractPpt;

public abstract class AbstractParty extends AbstractPpt implements Party {

    public AbstractParty(PartyRole aRole, PartyDescription aDescription) {
        super(aRole, aDescription);
    }

    protected AbstractParty() {
        super();
    }

    @Override
    public boolean sameValueAs(Party other) {
        return false;
    }

    protected MoreObjects.ToStringHelper string(){
        return super.string();

    }

    @Override
    public String toString() {
        return string()
                .toString();
    }
}
