package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

public class IsNullCriteria extends AbstractCriteria {

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
}
