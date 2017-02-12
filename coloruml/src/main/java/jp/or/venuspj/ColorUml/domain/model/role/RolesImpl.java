package jp.or.venuspj.ColorUml.domain.model.role;

import com.google.common.collect.Lists;
import jp.or.venuspj.ColorUml.domain.model.Role;
import jp.or.venuspj.ColorUml.domain.model.Roles;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.List;

/**
 */
public class RolesImpl implements Roles {
    private List<Role> list = Lists.newArrayList();

    RolesImpl() {
    }

    public RolesImpl(List<Role> aList) {
        list.addAll(aList);
    }

    @Override
    public List<Role> asList() {
        return list;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }

    @Override
    public void assess() {
        for (Role role : list) {
            role.assessAcrossMomentIntervals();
        }

    }
}
