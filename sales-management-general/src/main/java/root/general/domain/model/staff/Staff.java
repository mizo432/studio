package root.general.domain.model.staff;

import jp.or.venuspj.ColorUml.annotations.PersonType;
import jp.or.venuspj.ddd.model.entity.AbstractEntity;
import jp.or.venuspj.ddd.model.entity.EntityIdentifier;
import jp.or.venuspj.util.objects2.Objects2;
import root.general.domain.fundamentals.email.address.EmailAddress;
import root.general.domain.fundamentals.name.SimpleName;

/**
 * スタッフ（社内メンバー）
 */
@PersonType
public class Staff extends AbstractEntity<Staff> {
    SimpleName name;
    EmailAddress emailAddress;
    StaffRoles roles;
    Staff() {
    }

    public Staff(EntityIdentifier<Staff> anIdentifier, SimpleName aName, EmailAddress anEmailAddress,StaffRoles aRoles) {
        super(anIdentifier);
        name = aName;
        emailAddress = anEmailAddress;
        roles = aRoles;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("name",name)
                .add("emailAddress",emailAddress)
                .add("roles",roles)
                .omitNullValues()
                .toString();
    }
}
