package org.venuspj.studio.util.criteria;

import static org.venuspj.util.objects2.Objects2.*;

public abstract class AbstractCriteria implements Criteria {
    protected boolean empty = true;
    private Criteria parentCriteria;

    public boolean isEmpty() {
        return empty;
    }

    protected AbstractCriteria(Criteria aParentCriteria) {
        parentCriteria = aParentCriteria;

    }

    public AbstractCriteria() {
        parentCriteria = null;
    }

    @Override
    public void present() {
        if (nonNull(parentCriteria)) parentCriteria.present();
        empty = false;
    }
}
