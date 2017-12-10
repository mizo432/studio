package org.venuspj.studio.generic.criteria.primitive;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;

public class IsNullCriteria extends AbstractCompositeCriteria {

    private Boolean value;

    public static IsNullCriteria create(AbstractCriteria aCriteria) {
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
