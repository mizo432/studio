package org.venuspj.studio.util.criteria.primitive;

import org.venuspj.studio.util.criteria.AbstractCriteria;
import org.venuspj.studio.util.criteria.Criteria;

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
