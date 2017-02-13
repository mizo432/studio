package jp.or.venuspj.colorUml.domain.model.momentInterval;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.colorUml.domain.model.MomentInterval;
import jp.or.venuspj.colorUml.domain.model.MomentIntervalDetail;
import jp.or.venuspj.util.objects2.Objects2;

public class MomentIntervalDetailImpl implements MomentIntervalDetail {

    MomentInterval momentInterval;

    MomentIntervalDetailImpl() {
    }

    public MomentIntervalDetailImpl(MomentInterval aMomentInterval) {
        momentInterval = aMomentInterval;
    }

    protected MoreObjects.ToStringHelper string() {
        return Objects2
                .toStringHelper(this)
                .add("momentInterval", momentInterval);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
