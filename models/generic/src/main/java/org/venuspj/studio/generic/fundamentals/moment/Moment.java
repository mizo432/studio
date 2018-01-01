package org.venuspj.studio.generic.fundamentals.moment;

import org.venuspj.studio.generic.fundamentals.datetime.RecordDateTime;
import org.venuspj.studio.generic.model.ppt.party.Party;

public class Moment {
    public RecordDateTime getRecordDateTime() {
        return recordDateTime;
    }

    public Party getParty() {
        return party;
    }

    RecordDateTime recordDateTime;
    Party party;

    Moment() {

    }

    public Moment(RecordDateTime aRecordDateTime, Party aParty) {
        recordDateTime = aRecordDateTime;
        party = aParty;

    }

    public static Moment empty() {
        return new Moment(RecordDateTime.create(), null);
    }
}
