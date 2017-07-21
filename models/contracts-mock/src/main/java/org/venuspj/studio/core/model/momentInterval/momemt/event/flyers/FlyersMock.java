package org.venuspj.studio.core.model.momentInterval.momemt.event.flyers;

import org.venuspj.util.collect.Lists2;

/**
 */
public class FlyersMock {
    public static Flyers createDummy(FlyersType anEventIDType) {
        return new Flyers(Lists2.newArrayList(FlyerMock.createDummy()));
    }

    public enum FlyersType {
        EVENT_ON_END_OF_LAST_MONTH, EVENT_ON_START_OF_THIS_MONTH, EVENT_ON_YESTERDAY, EVENT_ON_TODAY, EVENT_ON_THREE_DAYS_AFTER, EVENT_ON_END_OF_THIS_MONTH, EVENT_ON_START_OF_NEXT_MONTH, DEFAULT;

        public Integer eventIdValue() {
            return 1;
        }
    }

}
