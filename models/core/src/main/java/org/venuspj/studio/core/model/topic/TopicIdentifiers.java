package org.venuspj.studio.core.model.topic;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;

/**
 */
public class TopicIdentifiers extends AbstractListValue<TopicIdentifier> {

    TopicIdentifiers() {

    }

    public TopicIdentifiers(Collection<? extends TopicIdentifier> anyList) {
        super(anyList);
    }

}
