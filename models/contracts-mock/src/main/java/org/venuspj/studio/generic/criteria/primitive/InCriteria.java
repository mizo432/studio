package org.venuspj.studio.generic.criteria.primitive;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class InCriteria<T> extends AbstractCompositeCriteria {


    private List<T> list = newArrayList();

    public InCriteria(AbstractCriteria aParentCriteria) {
        super(aParentCriteria);
    }

    public InCriteria() {
        super();
    }

    public static <T> InCriteria<T> create(AbstractCriteria aParentCriteria) {
        return new InCriteria<>(aParentCriteria);
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
