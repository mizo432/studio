package jp.or.venuspj.studio.core.model.studio;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.Thing;
import jp.or.venuspj.ddd.model.entity.AbstractEntity;
import jp.or.venuspj.ddd.model.entity.EntityIdentifier;

/**
 * スタジオ
 */
public class Studio extends AbstractEntity<Studio> {
    Thing thing;

    Studio() {
        super();

    }

    public Studio(EntityIdentifier<Studio> aStudioIdentifier, Thing aThing) {
        super(aStudioIdentifier);
        thing = aThing;

    }

    protected MoreObjects.ToStringHelper string() {
        return super.string()
                .add("thing", thing);

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
