package org.venuspj.studio.generic.criteria.primitive;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class NotInCriteria<T> extends AbstractCompositeCriteria {


    private List<T> list = newArrayList();

    public NotInCriteria(AbstractCriteria aParentCriteria) {
        super(aParentCriteria);
    }

    public NotInCriteria() {
        super();
    }

    public static <T> NotInCriteria<T> create(AbstractCriteria aParentCriteria) {
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
