package jp.or.venuspj.studo.general.model.MomentOrInterval;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.ddd.model.value.MomentOrIntervalValue;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public abstract class MomentOrInterval implements Value {
    MomentOrIntervalValue momentOrInterval;
    MomentOrIntervalDetails details;

    protected MomentOrInterval(MomentOrIntervalValue aMomentOrInterval, MomentOrIntervalDetails aDetails) {
        momentOrInterval = aMomentOrInterval;
        details = aDetails;
    }

    protected MomentOrInterval() {
    }

    protected MoreObjects.ToStringHelper string() {
        return Objects2
                .toStringHelper(this)
                .add("momentOrInterval", momentOrInterval)
                .add("details", details);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
