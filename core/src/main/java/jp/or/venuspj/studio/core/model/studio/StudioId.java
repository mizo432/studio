package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.ddd.model.entity.Identifier;
import jp.or.venuspj.studio.core.fundamentals.IntegerIdValue;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/02/12.
 */
public class StudioId implements Identifier<Studio>, IntegerIdValue {
    private Integer value;

    public StudioId() {
    }

    public StudioId(Integer value) {
    }

    @Override
    public int compareTo(Identifier<Studio> o) {
        return 0;
    }

    @Override
    public Integer asInteger() {
        return value;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
