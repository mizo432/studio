package org.venuspj.ddd.model.criteria.datetime;

import org.venuspj.ddd.model.criteria.AbstractEnumerableCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

import java.time.LocalDate;

public class LocalDateCriteria extends AbstractEnumerableCriteria<LocalDate> {
    public LocalDateCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public LocalDateCriteria() {
        super();
    }

    public static LocalDateCriteria empty(Criteria aParentCriteria) {
        return new LocalDateCriteria(aParentCriteria);
    }

}
