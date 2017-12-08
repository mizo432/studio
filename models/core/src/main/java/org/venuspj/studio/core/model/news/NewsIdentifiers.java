package org.venuspj.studio.core.model.news;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;

/**
 */
public class NewsIdentifiers extends AbstractListValue<NewsIdentifier> {

    NewsIdentifiers() {

    }

    public NewsIdentifiers(Collection<? extends NewsIdentifier> anyList) {
        super(anyList);
    }

}
