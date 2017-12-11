package org.venuspj.studio.util.criteria.primitive;

import org.venuspj.studio.util.criteria.AbstractCriteria;
import org.venuspj.studio.util.criteria.Criteria;

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
