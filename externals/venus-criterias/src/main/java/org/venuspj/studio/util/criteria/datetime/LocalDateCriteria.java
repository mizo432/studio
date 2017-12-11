package org.venuspj.studio.util.criteria.datetime;

import org.venuspj.studio.util.criteria.AbstractEnumerableCriteria;
import org.venuspj.studio.util.criteria.Criteria;

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
