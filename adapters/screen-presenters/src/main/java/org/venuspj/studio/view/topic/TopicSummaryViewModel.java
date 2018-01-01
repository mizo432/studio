package org.venuspj.studio.view.topic;

import org.venuspj.studio.core.model.topic.Topic;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

public class TopicSummaryViewModel {

    private Integer topicIdentifier;

    private String shortRecordDate;

    private String topicTitle;

    TopicSummaryViewModel(Integer aTopicIdentifier,
                          String aShortRecordDate,
                          String aTopicTitle) {
        topicIdentifier = aTopicIdentifier;
        shortRecordDate = aShortRecordDate;
        topicTitle = aTopicTitle;

    }

    public Integer getTopicIdentifier() {
        return topicIdentifier;
    }

    public String getShortRecordDate() {
        return shortRecordDate;
    }

    public String getTopicTitle() {
        return topicTitle;
    }


    public static class Builder extends ObjectBuilder<TopicSummaryViewModel, Builder> {
        private Integer topicIdentifier;

        private String shortRecordDate;

        private String topicTitle;

        @Override
        protected void apply(TopicSummaryViewModel vo, Builder aBuilder) {
            aBuilder.withTopicIdentifier(vo.getTopicIdentifier());
            aBuilder.withShortRecordDate(vo.getShortRecordDate());
            aBuilder.withTopicTitle(vo.getTopicTitle());


        }

        public Builder withTopicIdentifier(Integer aTopicIdentifier) {
            if (isNull(aTopicIdentifier)) return getThis();
            addConfigurator(builder -> builder.topicIdentifier = aTopicIdentifier);
            return getThis();
        }

        public Builder withShortRecordDate(String aShortRecordDate) {
            if (isNull(aShortRecordDate)) return getThis();
            addConfigurator(builder -> builder.shortRecordDate = aShortRecordDate);
            return getThis();
        }

        public Builder withTopicTitle(String aTopicTitle) {
            if (isNull(aTopicTitle)) return getThis();
            addConfigurator(builder -> builder.topicTitle = aTopicTitle);
            return getThis();
        }

        @Override
        protected TopicSummaryViewModel createValueObject() {
            return new TopicSummaryViewModel(topicIdentifier, shortRecordDate, topicTitle);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }

        public Builder from(Topic aTopic) {
            if (isNull(aTopic)) return getThis();
            withTopicIdentifier(aTopic.getTopicIdentifier().asInteger());
            withShortRecordDate(aTopic.getTopicInformation().getRecordDateTime().asDate().getDisplayShortDate());
            withTopicTitle(aTopic.getTopicInformation().getTitle().asText());
            return getThis();

        }
    }
}
