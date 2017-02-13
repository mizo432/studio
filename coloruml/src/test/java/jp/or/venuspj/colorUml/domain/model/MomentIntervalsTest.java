package jp.or.venuspj.colorUml.domain.model;

import com.google.common.collect.Lists;
import jp.or.venuspj.colorUml.domain.model.momentInterval.MomentIntervalsImpl;

/**
 */
public class MomentIntervalsTest {
   public static MomentIntervals createDummyData() {
        return new MomentIntervalsImpl(Lists.newArrayList());
    }
}