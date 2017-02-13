package jp.or.venuspj.colorUml.domain.model.momentInterval;

import com.google.common.collect.Lists;
import jp.or.venuspj.colorUml.domain.model.MomentInterval;
import jp.or.venuspj.colorUml.domain.model.MomentIntervals;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.List;

public class MomentIntervalsImpl implements MomentIntervals {

    private List<MomentInterval> list = Lists.newArrayList();

    MomentIntervalsImpl() {

    }

    public MomentIntervalsImpl(List<MomentInterval> aList) {
        list.addAll(aList);

    }

    @Override
    public List<MomentInterval> asList() {
        return list;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }
}
