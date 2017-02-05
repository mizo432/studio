package jp.or.venuspj.ColorUml.domain.model.partyPlaceThing;

import com.google.common.collect.Lists;
import jp.or.venuspj.ColorUml.domain.model.Ppt;
import jp.or.venuspj.ColorUml.domain.model.Ppts;

import java.util.List;

/**
 * Created by mizoguchi on 2017/02/04.
 */
public class PptsImpl<P extends Ppt<P>> implements Ppts<P> {
    List<P> list = Lists.newArrayList();

    PptsImpl() {
    }

    PptsImpl(List<P> aList) {
        list.addAll(aList);

    }

    @Override
    public List<P> asList() {
        return list;
    }
}
