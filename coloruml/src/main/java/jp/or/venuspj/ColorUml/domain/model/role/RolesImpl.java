package jp.or.venuspj.ColorUml.domain.model.role;

import com.google.common.collect.Lists;
import jp.or.venuspj.ColorUml.domain.model.Role;
import jp.or.venuspj.ColorUml.domain.model.Roles;

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
}
