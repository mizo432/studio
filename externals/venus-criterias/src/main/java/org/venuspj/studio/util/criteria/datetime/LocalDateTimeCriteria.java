package org.venuspj.studio.util.criteria.datetime;

import org.venuspj.studio.util.criteria.AbstractEnumerableCriteria;
import org.venuspj.studio.util.criteria.Criteria;

import java.time.LocalDateTime;

public class LocalDateTimeCriteria extends AbstractEnumerableCriteria<LocalDateTime> {
    public LocalDateTimeCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public LocalDateTimeCriteria() {
        super();
    }

    public static LocalDateTimeCriteria empty(Criteria aParentCriteria) {
        return new LocalDateTimeCriteria(aParentCriteria);
    }

}
