package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class NotInCriteria<T> extends AbstractCriteria {


    private List<T> list = newArrayList();

    public NotInCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public NotInCriteria() {
        super();
    }

    public static <T> NotInCriteria<T> create(Criteria aParentCriteria) {
        return new NotInCriteria<>(aParentCriteria);
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
