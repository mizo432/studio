package org.venuspj.ddd.model.criteria.text;

import org.venuspj.ddd.model.criteria.AbstractConcreteCriteria;
import org.venuspj.ddd.model.criteria.Criteria;
import org.venuspj.ddd.model.criteria.primitive.LikeCriteria;

public class TextCriteria extends AbstractConcreteCriteria<String> {

    private LikeCriteria likeCriteria = LikeCriteria.create(this);

    protected TextCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    protected TextCriteria() {
        super();
    }

    public static TextCriteria create(Criteria aPearentCriteria) {
        return new TextCriteria(aPearentCriteria);
    }


    public void like(String aValue) {
        likeCriteria.setValue(aValue);
        present();
    }

    public LikeCriteria getLike() {
        return likeCriteria;
    }

}
