package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;
import org.venuspj.util.strings2.Strings2;

public class LikeCriteria extends AbstractCriteria {

    private String value;

    public static LikeCriteria create(Criteria aCriteria) {
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
