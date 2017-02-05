package jp.or.venuspj.ColorUml.domain.model.momentInterval;

import jp.or.venuspj.ColorUml.domain.model.MomentInterval;
import jp.or.venuspj.ColorUml.domain.model.MomentIntervals;

/**
 */
public class MomentIntervalsImplTest {

    public static <MI extends MomentInterval<MI>> MomentIntervals<MI> createDummy() {
        return new MomentIntervalsImpl();
    }
}