package org.venuspj.studio.util.criteria.datetime;

import org.venuspj.studio.util.criteria.Criteria;
import org.venuspj.studio.util.criteria.AbstractEnumerableCriteria;

import java.time.YearMonth;

public class YearMonthCriteria extends AbstractEnumerableCriteria<YearMonth> {
    public YearMonthCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public YearMonthCriteria() {
        super();
    }

    public static YearMonthCriteria empty(Criteria aParentCriteria) {
        return new YearMonthCriteria(aParentCriteria);
    }

}
