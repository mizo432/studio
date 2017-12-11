package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

public class IsNotNullCriteria extends AbstractCriteria {

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
}
