package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.topic;

import org.venuspj.ddd.model.value.AbstractListValue;
import org.venuspj.studio.core.model.momentInterval.momemt.news.News;

public class Topics extends AbstractListValue<News> {
    public static Topics empty() {
        return new Topics();
    }
}
