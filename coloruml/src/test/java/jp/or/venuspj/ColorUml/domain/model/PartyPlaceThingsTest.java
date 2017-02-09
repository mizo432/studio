package jp.or.venuspj.ColorUml.domain.model;

import com.google.common.collect.Lists;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.PartyPlaceThingsImpl;

/**
 * Created by kenichimizoguchi on 2017/02/09.
 */
public class PartyPlaceThingsTest {

    public static PartyPlaceThings createDummyData(){
        return new PartyPlaceThingsImpl(Lists.newArrayList());
    }

}