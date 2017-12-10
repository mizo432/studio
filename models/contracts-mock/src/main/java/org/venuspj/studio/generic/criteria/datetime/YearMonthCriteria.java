package org.venuspj.studio.generic.criteria.datetime;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.primitive.BetweenCriteria;
import org.venuspj.studio.generic.criteria.primitive.EqualCriteria;
import org.venuspj.studio.generic.criteria.primitive.InCriteria;

import java.time.YearMonth;
import java.util.Collection;

public class YearMonthCriteria extends AbstractCompositeCriteria {

    private EqualCriteria<YearMonth> equalCriteria = EqualCriteria.create(this);
    private BetweenCriteria<YearMonth> betweenCriteria = BetweenCriteria.create(this);
    private InCriteria<YearMonth> inCriteria = InCriteria.create(this);

    public static YearMonthCriteria empty() {
        return new YearMonthCriteria();
    }

    public void equal(YearMonth aYearMonth) {
        equalCriteria.setValue(aYearMonth);
        present();
    }

    public void between(YearMonth aFrom, YearMonth aTo) {
        betweenCriteria.setValue(aFrom, aTo);
        present();
    }

    public EqualCriteria<YearMonth> getEqual() {
        return equalCriteria;
    }

    public BetweenCriteria<YearMonth> getBetweenCriteria() {
        return betweenCriteria;
    }

    public InCriteria<YearMonth> getIn() {
        return inCriteria;
    }

    public void like(Collection<YearMonth> anyCollection) {
        inCriteria.setValue(anyCollection);
        present();
    }

}
