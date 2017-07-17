package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.util.strings2.Strings2;

/**
 */
public class DescriptionMock {
    public static Description createDummy(DescriptionType anDescriptionType) {
        return new Description(anDescriptionType.text());
    }

    public enum DescriptionType {
        EVENT_DESCRIPTION_ON_END_OF_LAST_MONTH, EVENT_DESCRIPTION_ON_START_OF_THIS_MONTH, EVENT_DESCRIPTION_ON_YESTERDAY,
        EVENT_DESCRIPTION_ON_TODAY, EVENT_DESCRIPTION_ON_THREE_DAYS_AFTER, EVENT_DESCRIPTION_ON_END_OF_THIS_MONTH,
        EVENT_DESCRIPTION_ON_START_OF_NEXT_MONTH, DEFAULT, STUDIO, ALBUM1, EVENT_DESCRIPTION_ON_TOMORROW, EVENT_DESCRIPTION_ON_ON_THREE_DAYS_BEFORE;

        public String text() {
            return Strings2.repeat(name() + ", ", 10);
        }
    }
}
