package root.general.domain.model.partnerBranch;

import com.google.common.collect.Lists;
import jp.or.venuspj.ddd.model.value.ListValue;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.List;

public class PartnerBranches implements ListValue<PartnerBranch> {
    List<PartnerBranch> list = Lists.newArrayList();

    PartnerBranches() {
    }

    public PartnerBranches(List<PartnerBranch> aList) {
        list.addAll(aList);
    }

    @Override
    public List<PartnerBranch> asList() {
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
