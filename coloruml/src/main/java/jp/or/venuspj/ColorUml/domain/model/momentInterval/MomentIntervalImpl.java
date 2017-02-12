package jp.or.venuspj.ColorUml.domain.model.momentInterval;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.ColorUml.domain.fundamentals.DateOrDatetimeOrInterval.DateOrDatetimeOrInterval;
import jp.or.venuspj.ColorUml.domain.model.MakeMomentInterval;
import jp.or.venuspj.ColorUml.domain.model.MomentInterval;
import jp.or.venuspj.ColorUml.domain.model.MomentIntervalDetails;
import jp.or.venuspj.util.objects2.Objects2;

public class MomentIntervalImpl implements MomentInterval {
    DateOrDatetimeOrInterval dateOrDatetimeOrInterval;
    MomentIntervalDetails momentIntervalDetails;
    MakeMomentInterval makeMomentInterval;

    MomentIntervalImpl() {
    }

    public MomentIntervalImpl(DateOrDatetimeOrInterval aDateOrDatetimeOrInterval, MomentIntervalDetails aMomentIntervalDetails,MakeMomentInterval aMakeMomentInterval) {
        dateOrDatetimeOrInterval = aDateOrDatetimeOrInterval;
        momentIntervalDetails = aMomentIntervalDetails;
        makeMomentInterval = aMakeMomentInterval;
    }

    protected MoreObjects.ToStringHelper string() {
        return Objects2
                .toStringHelper(this)
                .add("dateOrDatetimeOrInterval", dateOrDatetimeOrInterval)
                .add("aMomentIntervalDetails", momentIntervalDetails);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }


    @Override
    public void makeMomentInterval() {
        makeMomentInterval.makeMomentInterval(this);
    }
}
