package jp.or.venuspj.studo.general.model.MomentOrInterval;

import com.google.common.collect.Lists;
import jp.or.venuspj.ddd.model.value.ListValue;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.List;

/**
 * Created by mizoguchi on 2017/01/22.
 */
public class MomentOrIntervalDetails<E extends MomentOrIntervalDetail> implements ListValue<E> {
    private List<E> list = Lists.newArrayList();
    protected MomentOrIntervalDetails(){}
    protected MomentOrIntervalDetails(List<E> aList){
        list = aList;
    }
    @Override
    public List<E> asList() {
        return list;
    }

    @Override
    public boolean equals(Object that) {
        return Objects2.nonNull(this)
                ;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
