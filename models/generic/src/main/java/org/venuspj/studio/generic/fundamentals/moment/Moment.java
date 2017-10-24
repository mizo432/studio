package org.venuspj.studio.generic.fundamentals.moment;

import org.venuspj.studio.generic.fundamentals.datetime.RecordDateTime;
import org.venuspj.studio.generic.model.ppt.party.DefaultParty;
import org.venuspj.studio.generic.model.ppt.party.Party;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Moment {
    RecordDateTime recordDateTime;
    Party party;

    Moment() {

    }

    public Moment(RecordDateTime aRecordDateTime, Party aParty) {
        recordDateTime = aRecordDateTime;
        party = aParty;

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("recordDateTime", recordDateTime)
                .add("party", party)
                .omitNullValues()
                .toString();
    }

    public static Moment emptyMoment() {
        return new Moment(RecordDateTime.empty(), DefaultParty.emptyParty());
    }
}
