package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

/**
 */
public class NewsId extends AbstractEntityIdentifier<News> {
    Integer value;

    NewsId() {
        super(News.class);
    }

    public NewsId(Integer aValue) {
        super(News.class);
        value = aValue;
    }

    public static NewsId defaultNewsId() {
        return new NewsId();
    }

    @Override
    public int hashCode() {
        return hash(kind, value);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (o instanceof NewsId) {
            NewsId other = (NewsId) o;
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
}
