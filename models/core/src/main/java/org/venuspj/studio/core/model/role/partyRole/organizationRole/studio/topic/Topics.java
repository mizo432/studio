package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.topic;

import org.venuspj.ddd.model.value.AbstractListValue;
import org.venuspj.studio.core.model.topic.Topic;

public class Topics extends AbstractListValue<Topic> {
    public static Topics empty() {
        return new Topics();
    }
}
