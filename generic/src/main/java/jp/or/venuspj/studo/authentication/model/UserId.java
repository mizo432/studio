package jp.or.venuspj.studo.authentication.model;

import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/03/25.
 */
public class UserId implements Value, DecidableSameValueAs<UserId> {
    private Integer value;

    public UserId(Integer aValue) {
        value = aValue;
    }

    @Override
    public boolean sameValueAs(UserId other) {
        return Objects2.nonNull(other) && Objects2.equal(value, other.value);
    }
}
