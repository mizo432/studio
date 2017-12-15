package org.venuspj.studio.core.model.news;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;

/**
 */
public class Newses extends AbstractListValue<News> {

    Newses() {
    }

    public Newses(Collection<News> anyList) {
        list.addAll(anyList);
    }

}
