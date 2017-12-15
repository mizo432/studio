package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

import java.util.function.Predicate;

import static org.venuspj.util.objects2.Objects2.isNull;

public class IsNullCriteria extends AbstractCriteria implements Predicate<Object> {

    private Boolean value;

    public static IsNullCriteria create(Criteria aCriteria) {
        return new IsNullCriteria();
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(Boolean aValue) {
        value = aValue;
        present();
    }

    public boolean test(Object aValue) {
        return isNull(aValue);
    }
}
