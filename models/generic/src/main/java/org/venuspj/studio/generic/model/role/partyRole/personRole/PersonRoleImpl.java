package org.venuspj.studio.generic.model.role.partyRole.personRole;

import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.parson.Person;
import org.venuspj.studio.generic.model.ppt.party.parson.PersonImpl;
import org.venuspj.studio.generic.model.role.partyRole.PartyRoleImpl;

public abstract class PersonRoleImpl
        extends PartyRoleImpl
        implements Person, PersonRole {

    private final Person person;

    public PersonRoleImpl() {
        this(PersonImpl.emptyPerson());
    }

    public PersonRoleImpl(Person aPerson) {
        super(aPerson);
        person = aPerson;
    }

    @Override
    public Party clone() {
        Party b = null;

        /*ObjectクラスのcloneメソッドはCloneNotSupportedExceptionを投げる可能性があるので、try-catch文で記述(呼び出し元に投げても良い)*/
        try {
            b = (Party) super.clone(); //親クラスのcloneメソッドを呼び出す(親クラスの型で返ってくるので、自分自身の型でのキャストを忘れないようにする)
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;

    }

}
