package jp.or.venuspj.ColorUml.domain.model.partyPlaceThing;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.ColorUml.domain.fundamentals.Name.Name;
import jp.or.venuspj.ColorUml.domain.model.Description;
import jp.or.venuspj.ColorUml.domain.model.PartyPlaceThing;
import jp.or.venuspj.ColorUml.domain.model.Roles;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.Place.Address;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class PartyPlaceThingImpl implements PartyPlaceThing {
    SerialNumber serialNumber;
    Name name;
    Address address;
    Description description;
    Roles roles;

    protected PartyPlaceThingImpl() {

    }

    public PartyPlaceThingImpl(SerialNumber aSerialNumber, Name aName, Address anAddress, Roles aRoles, Description aDescription) {
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
