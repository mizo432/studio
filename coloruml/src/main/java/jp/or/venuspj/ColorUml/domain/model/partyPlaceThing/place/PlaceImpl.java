package jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.place;

import jp.or.venuspj.ColorUml.domain.model.PartyPlaceThing;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.Place;
import jp.or.venuspj.util.objects2.Objects2;

public class PlaceImpl implements Place {
    PartyPlaceThing partyPlaceThing;

    PlaceImpl(){

    }

    public PlaceImpl(PartyPlaceThing aPartyPlaceThing){

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("partyPlaceThing",partyPlaceThing)
                .toString();
    }

    @Override
    public void assess() {

    }
}
