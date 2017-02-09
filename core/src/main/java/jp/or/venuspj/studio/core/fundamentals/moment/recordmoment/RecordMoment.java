package jp.or.venuspj.studio.core.fundamentals.moment.recordmoment;

import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.studo.general.fundamentals.datetime.RecordDateTime;
import jp.or.venuspj.studo.general.model.relationship.party.person.Person;
import jp.or.venuspj.util.objects2.Objects2;

public class RecordMoment implements Value,DecidableSameValueAs<RecordMoment> {
    private RecordDateTime recordDateTime;
    private Person person;

    RecordMoment() {
    }

    public RecordMoment(RecordDateTime aRecordDateTime, Person aPerson) {
        person = aPerson;
        recordDateTime = aRecordDateTime;

    }

    @Override
    public boolean sameValueAs(RecordMoment other) {
        if (Objects2.isNull(other)) return false;
        return recordDateTime.sameValueAs(other.recordDateTime) &&
                person.sameIdentifierAs(other.person);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("recordDateTime", recordDateTime)
                .add("party", person)
                .omitNullValues()
                .toString();
    }

}
