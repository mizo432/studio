package org.venuspj.studio.util.criteria.primitive;

import org.venuspj.studio.util.criteria.AbstractCriteria;
import org.venuspj.studio.util.criteria.Criteria;
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
