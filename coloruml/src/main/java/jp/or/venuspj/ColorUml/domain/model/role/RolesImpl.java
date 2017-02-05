package jp.or.venuspj.ColorUml.domain.model.role;

import com.google.common.collect.Lists;
import jp.or.venuspj.ColorUml.domain.model.Role;
import jp.or.venuspj.ColorUml.domain.model.Roles;

import java.util.List;

/**
 */
public class RolesImpl<R extends Role<R>> implements Roles<R> {
    private List<R> list = Lists.newArrayList();

    RolesImpl() {
    }

    RolesImpl(List<R> aList) {
        list.addAll(aList);
    }

    @Override
    public List<R> asList() {

        return list;
    }
}
