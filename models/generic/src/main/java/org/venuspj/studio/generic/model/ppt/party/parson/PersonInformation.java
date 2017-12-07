package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.studio.generic.model.ppt.party.AddressUse;
import org.venuspj.studio.generic.model.ppt.party.PartyInformation;

public class PersonInformation extends PartyInformation {

    public PersonInformation(AddressUse anAddressUse) {
        super(anAddressUse);
    }

    public static PersonInformation empty() {
        return new PersonInformation(new AddressUse.Builder().build());
    }

}
