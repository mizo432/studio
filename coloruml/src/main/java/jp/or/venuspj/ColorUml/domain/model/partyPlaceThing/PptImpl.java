package jp.or.venuspj.ColorUml.domain.model.partyPlaceThing;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.ColorUml.domain.fundamentals.Name.Name;
import jp.or.venuspj.ColorUml.domain.model.Description;
import jp.or.venuspj.ColorUml.domain.model.Ppt;
import jp.or.venuspj.ColorUml.domain.model.Role;
import jp.or.venuspj.ColorUml.domain.model.Roles;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.Place.Address;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class PptImpl<PPT extends PptImpl<PPT, R, D>, R extends Role<R>, D extends Description<D>> implements Ppt<PPT> {
    SerialNumber serialNumber;
    Name name;
    Address address;
    D description;
    Roles<R> roles;

    PptImpl() {
    }

    public PptImpl(SerialNumber aSerialNumber, Name aName, Address anAddress, Roles<R> aRoles, D aDescription) {
        serialNumber = aSerialNumber;
        name = aName;
        address = anAddress;
        roles = aRoles;
        description = aDescription;
    }

    protected MoreObjects.ToStringHelper string() {
        return Objects2
                .toStringHelper(this)
                .add("serialNumber", serialNumber)
                .add("address", address)
                .add("name", name)
                .add("description", description);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
