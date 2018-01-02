package org.venuspj.studio.core.model.topic.topics;

import org.venuspj.ddd.model.value.AbstractListValue;
import org.venuspj.studio.core.model.topic.Topic;

import java.util.Collection;

/**
 */
public class Topics extends AbstractListValue<Topic> {

    Topics() {
    }

    public Topics(Collection<Topic> anyList) {
        list.addAll(anyList);
    }

}
