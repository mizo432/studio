package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.studio.generic.model.ppt.PptInfo;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;

public class PartyInfo extends PptInfo {
    public PartyInfo() {

    }

    public static PartyInfo emptyPartyInfo() {
        return new PartyInfo();
    }

    protected Objects2.ToStringHelper string() {
        return toStringHelper(this)
//                .add("identifier", identifier())
//                .add("partyInfo", partyInfo);
                ;

    }

    @Override
    public String toString() {
        return this.string()
                .omitNullValues()
                .toString();
    }
}
