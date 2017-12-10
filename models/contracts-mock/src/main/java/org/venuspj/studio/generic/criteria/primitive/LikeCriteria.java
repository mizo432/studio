package org.venuspj.studio.generic.criteria.primitive;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;
import org.venuspj.util.strings2.Strings2;

public class LikeCriteria extends AbstractCompositeCriteria {

    private String value;

    public static LikeCriteria create(AbstractCriteria aCriteria) {
        return new LikeCriteria();
    }

    public String getValue() {
        return Strings2.surround(value, "%");
    }

    public void setValue(String aValue) {
        value = aValue;
        present();
    }
}
