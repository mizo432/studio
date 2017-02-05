package jp.or.venuspj.ColorUml.domain.model.momentInterval;

import jp.or.venuspj.ColorUml.domain.model.MomentInterval;
import jp.or.venuspj.ColorUml.domain.model.MomentIntervals;

import java.util.List;

public class MomentIntervalsImpl<T extends MomentInterval<T>> implements MomentIntervals<T> {

    private List<T> list;

    @Override
    public List<T> asList() {
        return list;
    }
}
