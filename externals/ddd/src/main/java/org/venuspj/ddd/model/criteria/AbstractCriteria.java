package org.venuspj.ddd.model.criteria;

import static org.venuspj.util.objects2.Objects2.*;

public abstract class AbstractCriteria implements Criteria {
    protected boolean empty = true;
    private Criteria parentCriteria;

    protected AbstractCriteria(Criteria aParentCriteria) {
        parentCriteria = aParentCriteria;

    }

    public AbstractCriteria() {
        parentCriteria = null;
    }

    public Boolean isEmpty() {
        return empty;
    }

    public Boolean isSpecified() {
        return !empty;
    }

    @Override
    public void present() {
        if (nonNull(parentCriteria)) parentCriteria.present();
        empty = false;
    }

}
