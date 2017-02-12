package jp.or.venuspj.studio.core.model.link;

import com.google.common.collect.Lists;
import jp.or.venuspj.ddd.model.value.ListValue;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.List;

/**
 * Created by mizoguchi on 2017/01/28.
 */
public class Links implements ListValue<Link> {
    private List<Link> list = Lists.newArrayList();
    Links(){}
    public Links(List<Link> aList){
        list.addAll(aList);
    }
    @Override
    public List<Link> asList() {
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
