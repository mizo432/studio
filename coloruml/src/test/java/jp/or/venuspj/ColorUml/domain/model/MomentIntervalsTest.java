package jp.or.venuspj.ColorUml.domain.model;

import com.google.common.collect.Lists;
import jp.or.venuspj.ColorUml.domain.model.momentInterval.MomentIntervalsImpl;

/**
 */
public class MomentIntervalsTest {
   public static MomentIntervals createDummyData() {
        return new MomentIntervalsImpl(Lists.newArrayList());
    }
}