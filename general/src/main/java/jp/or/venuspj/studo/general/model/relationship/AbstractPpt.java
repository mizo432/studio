package jp.or.venuspj.studo.general.model.relationship;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.util.objects2.Objects2;

public abstract class AbstractPpt implements Ppt {

    private Role role;
    private Description description;

    public AbstractPpt(Role aRole, Description aDescription) {
        role = aRole;
        description = aDescription;
    }

    protected AbstractPpt() {

    }

    protected Description description() {
        return description;
    }

    protected Role role() {
        return role;
    }

    protected MoreObjects.ToStringHelper string(){
        return Objects2
                .toStringHelper(this)
                .add("role",role)
                .add("description",description);

    }

    @Override
    public String toString() {
        return string()
                .toString();
    }

}
