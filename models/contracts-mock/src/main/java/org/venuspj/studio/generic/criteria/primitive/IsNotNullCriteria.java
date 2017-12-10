package org.venuspj.studio.generic.criteria.primitive;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;

public class IsNotNullCriteria extends AbstractCompositeCriteria {

    private Boolean value;

    public static IsNotNullCriteria create(AbstractCriteria aCriteria) {
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
