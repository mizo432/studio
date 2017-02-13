package jp.or.venuspj.colorUml.domain.model.partyPlaceThing;

import com.google.common.collect.Lists;
import jp.or.venuspj.colorUml.domain.model.PartyPlaceThing;
import jp.or.venuspj.colorUml.domain.model.PartyPlaceThings;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.List;

/**
 * Created by mizoguchi on 2017/02/04.
 */
public class PartyPlaceThingsImpl implements PartyPlaceThings {
    List<PartyPlaceThing> list = Lists.newArrayList();

    PartyPlaceThingsImpl() {
    }

    public PartyPlaceThingsImpl(List<PartyPlaceThing> aList) {
        list.addAll(aList);

    }

    @Override
    public List<PartyPlaceThing> asList() {
        return list;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }
}
