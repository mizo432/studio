package org.venuspj.studio.core.model.news;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

/**
 */
public class NewsIdentifier extends AbstractEntityIdentifier<News> {

    private final Integer value;

    NewsIdentifier() {
        super(News.class);
        value = null;
    }

    public NewsIdentifier(Integer aValue) {
        super(News.class);
        value = aValue;
    }

    public static NewsIdentifier defaultNewsId() {
        return new NewsIdentifier();
    }

    @Override
    public int hashCode() {
        return hash(kind, value);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (o instanceof NewsIdentifier) {
            NewsIdentifier other = (NewsIdentifier) o;
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
