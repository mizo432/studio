package jp.or.venuspj.studio.core.model;

import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.studo.general.model.relationship.party.Party;
import jp.or.venuspj.util.objects2.Objects2;

public class PlayerValue implements Value, DecidableSameValueAs<PlayerValue> {
    private Party party;
    PlayerValue(){

    }
    PlayerValue(Party aParty){
        party = aParty;

    }
    @Override
    public boolean sameValueAs(PlayerValue other) {
        return Objects2.nonNull(other) &&
                party.sameValueAs(other.party);
    }

}
