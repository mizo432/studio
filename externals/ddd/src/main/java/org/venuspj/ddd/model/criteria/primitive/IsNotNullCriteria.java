package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

import java.util.function.Predicate;

import static org.venuspj.util.objects2.Objects2.nonNull;

public class IsNotNullCriteria extends AbstractCriteria implements Predicate<Object> {

    private Boolean value;

    public static IsNotNullCriteria create(Criteria aCriteria) {
        return new IsNotNullCriteria();
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(Boolean aValue) {
        value = aValue;
        present();
    }

    public boolean test(Object aValue) {
        return nonNull(aValue);
    }
}
