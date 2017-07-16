package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.util.objects2.Objects2;

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

    public static NewsId defaultEventId() {
        return new NewsId();
    }

    @Override
    public int hashCode() {
        return Objects2.hash(kind, value);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (o instanceof NewsId) {
            NewsId other = (NewsId) o;
            return Objects2.equal(value, other.value);
        }
        return false;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("kind", kind)
                .addValue(value)
                .toString();
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }

}
