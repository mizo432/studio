package org.venuspj.studio.generic.criteria.text;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;
import org.venuspj.studio.generic.criteria.primitive.EqualCriteria;
import org.venuspj.studio.generic.criteria.primitive.InCriteria;
import org.venuspj.studio.generic.criteria.primitive.LikeCriteria;

import java.util.Collection;

public class TextCriteria extends AbstractCompositeCriteria {

    private EqualCriteria<String> equalCriteria = EqualCriteria.create(this);
    private LikeCriteria likeCriteria = LikeCriteria.create(this);
    private InCriteria<String> inCriteria = InCriteria.create(this);

    protected TextCriteria(AbstractCriteria aParentCriteria) {
        super(aParentCriteria);
    }

    protected TextCriteria() {
        super();
    }

    public static TextCriteria create(AbstractCriteria aPearentCriteria) {
        return new TextCriteria(aPearentCriteria);
    }

    public void equal(String aValue) {
        equalCriteria.setValue(aValue);
        present();
    }

    public EqualCriteria<String> getEqual() {
        return equalCriteria;
    }

    public void like(String aValue) {
        likeCriteria.setValue(aValue);
        present();
    }

    public LikeCriteria getLike() {
        return likeCriteria;
    }

    public InCriteria<String> getIn() {
        return inCriteria;
    }

    public void like(Collection<String> anyCollection) {
        inCriteria.setValue(anyCollection);
        present();
    }

}
