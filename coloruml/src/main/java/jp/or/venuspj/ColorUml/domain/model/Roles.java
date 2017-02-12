package jp.or.venuspj.ColorUml.domain.model;

import jp.or.venuspj.ddd.model.value.ListValue;

public interface Roles extends ListValue<Role> {

    void assess();
}
