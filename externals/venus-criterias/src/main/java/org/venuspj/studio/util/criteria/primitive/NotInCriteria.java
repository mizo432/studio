package org.venuspj.studio.util.criteria.primitive;

import org.venuspj.studio.util.criteria.AbstractCriteria;
import org.venuspj.studio.util.criteria.Criteria;

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

    public void setValue(T... anyArray) {
        list.addAll(newArrayList(anyArray));
        present();
    }

}
