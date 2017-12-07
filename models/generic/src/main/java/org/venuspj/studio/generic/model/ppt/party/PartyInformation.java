package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.studio.generic.model.ppt.PptInformation;

public class PartyInformation extends PptInformation {
    public AddressUse addressUse;

    PartyInformation() {
        addressUse = new AddressUse.Builder().build();

    }

    public PartyInformation(AddressUse anAddressUse) {
        addressUse = anAddressUse;

    }

    public static PartyInformation empty() {
        return new PartyInformation();
    }

}
