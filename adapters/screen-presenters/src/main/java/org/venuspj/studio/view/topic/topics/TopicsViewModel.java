package org.venuspj.studio.view.topic.topics;

import org.venuspj.ddd.model.value.AbstractListValue;
import org.venuspj.studio.core.model.topic.Topic;
import org.venuspj.studio.core.model.topic.topics.Topics;
import org.venuspj.studio.view.topic.TopicSummaryViewModel;
import org.venuspj.util.builder.ObjectBuilder;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

public class TopicsViewModel extends AbstractListValue<TopicSummaryViewModel> {
    public TopicsViewModel(Collection<TopicSummaryViewModel> anyCollection) {
        super(anyCollection);
    }

    TopicsViewModel() {

    }

    public static TopicsViewModel create() {
        return new TopicsViewModel();
    }


    public static class Builder extends ObjectBuilder<TopicsViewModel, Builder> {
        private List<TopicSummaryViewModel> list = newArrayList();

        @Override
        protected void apply(TopicsViewModel vo, Builder builder) {

        }

        @Override
        protected TopicsViewModel createValueObject() {
            return null;
        }

        @Override
        protected Builder getThis() {
            return null;
        }

        @Override
        protected Builder newInstance() {
            return null;
        }

        public Builder from(Topics anyTopics) {
            if (isNull(anyTopics)) return getThis();
            addConfigurator(builder -> {
                for (Topic topic : anyTopics)
                    builder
                            .list
                            .add(new TopicSummaryViewModel
                                    .Builder()
                                    .from(topic)
                                    .build());
            });
            return getThis();
        }
    }
}
