package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class StudioId extends AbstractEntityIdentifier<Studio> {
    private Integer value;

    StudioId() {
        super(Studio.class);
    }

    public StudioId(Integer aValue) {
        super(Studio.class);
        value = aValue;
    }

    @Override
    public boolean equals(Object o) {
        if (Objects2.isNull(o)) return false;
        if (o instanceof StudioId) {
            StudioId that;
            that = (StudioId) o;
            return super.equals(o) && Objects2.equal(value, that.value);
        }
        return false;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("kind", kind)
                .add("value", value)
                .omitNullValues()
                .toString();
    }
}
