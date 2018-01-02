package org.venuspj.studio.core.model.topic;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

/**
 */
public class TopicIdentifier extends AbstractEntityIdentifier<Topic> {

    private final Integer value;

    TopicIdentifier() {
        super(Topic.class);
        value = null;
    }

    public TopicIdentifier(Integer aValue) {
        super(Topic.class);
        value = aValue;
    }

    public static TopicIdentifier defaultNewsId() {
        return new TopicIdentifier();
    }

    @Override
    public int hashCode() {
        return hash(kind, value);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (o instanceof TopicIdentifier) {
            TopicIdentifier other = (TopicIdentifier) o;
            return equal(value, other.value);
        }
        return false;
    }

    public boolean isPresent() {
        return nonNull(value);
    }

    @Override
    public boolean isEmpty() {
        return isNull(value);
    }

    public Integer asInteger() {
        return value;
    }
}
