package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.core.model.momentInterval.momemt.event.eventOutline.Outline;

/**
 */
public final class OutlineMock {
    public static Outline createDummy(OutlineType anOutlineType) {
        return Outline.defaultOutline();
    }

    public enum OutlineType {
        EVENT_ON_END_OF_LAST_MONTH, EVENT_ON_START_OF_THIS_MONTH, EVENT_ON_YESTERDAY, EVENT_ON_TODAY, EVENT_ON_THREE_DAYS_AFTER, EVENT_ON_END_OF_THIS_MONTH, EVENT_ON_START_OF_NEXT_MONTH, DEFAULT, DEFAILT;

        public Integer eventIdValue() {
            return 1;
        }
    }
}
