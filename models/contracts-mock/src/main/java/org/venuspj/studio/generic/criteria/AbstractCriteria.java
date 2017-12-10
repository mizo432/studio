package org.venuspj.studio.generic.criteria;

public class AbstractCriteria {

    protected boolean empty = true;

    protected void present() {
        empty = false;
    }

    public boolean isEmpty() {
        return empty;
    }

}
