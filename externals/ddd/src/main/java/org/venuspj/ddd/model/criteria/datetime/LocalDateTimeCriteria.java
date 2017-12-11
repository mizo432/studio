package org.venuspj.ddd.model.criteria.datetime;

import org.venuspj.ddd.model.criteria.AbstractEnumerableCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

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
