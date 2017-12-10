package org.venuspj.studio.generic.criteria;

import static org.venuspj.util.objects2.Objects2.*;

public class AbstractCompositeCriteria extends AbstractCriteria {
    private AbstractCriteria parentCriteria;

    protected AbstractCompositeCriteria(AbstractCriteria aParentCriteria) {
        parentCriteria = aParentCriteria;

    }

    public AbstractCompositeCriteria() {
        parentCriteria = null;
    }

    @Override
    public void present() {
        if (nonNull(parentCriteria)) parentCriteria.present();
        empty = false;
    }
}
