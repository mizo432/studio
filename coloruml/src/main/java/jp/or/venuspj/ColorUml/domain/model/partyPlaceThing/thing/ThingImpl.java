package jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.thing;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.ColorUml.domain.model.PartyPlaceThing;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.Thing;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * 物
 */
public class ThingImpl implements Thing {
    protected PartyPlaceThing partyPlaceThing;

    ThingImpl() {

    }

    public ThingImpl(PartyPlaceThing aPartyPlaceThing) {
        partyPlaceThing = aPartyPlaceThing;

    }


    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

    private MoreObjects.ToStringHelper string() {
        return Objects2
                .toStringHelper(this)
                .add("partyPlaceThing", partyPlaceThing);
    }

    @Override
    public void assess() {
        partyPlaceThing.assess();
    }
}
