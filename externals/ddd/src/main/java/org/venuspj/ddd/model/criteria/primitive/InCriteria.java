package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class InCriteria<T> extends AbstractCriteria {


    private List<T> list = newArrayList();

    public InCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public InCriteria() {
        super();
    }

    public static <T> InCriteria<T> create(Criteria aParentCriteria) {
        return new InCriteria<>(aParentCriteria);
    }

    public List<T> getList() {
        return unmodifiableList(list);
    }

    public void setValue(Collection<T> anyCollection) {
        list.addAll(anyCollection);
        present();
    }

    @SuppressWarnings("unchecked")
    public void setValue(T... anyArray) {
        list.addAll(newArrayList(anyArray));
        present();
    }

}
