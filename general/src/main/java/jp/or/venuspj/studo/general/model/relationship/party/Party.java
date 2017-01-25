package jp.or.venuspj.studo.general.model.relationship.party;

import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.studo.general.model.relationship.Ppt;

public interface Party extends Ppt, DecidableSameValueAs<Party> {

}
