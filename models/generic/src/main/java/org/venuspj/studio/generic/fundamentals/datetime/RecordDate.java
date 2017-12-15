package org.venuspj.studio.generic.fundamentals.datetime;

import org.venuspj.ddd.model.value.DecidableSameValueAs;
import org.venuspj.ddd.model.value.Value;
import org.venuspj.util.objects2.Objects2;

import java.time.LocalDate;
import java.util.function.Predicate;

/**
 * 日付：年月日を示す
 */
public class RecordDate implements Value, DecidableSameValueAs<RecordDate> {
    private LocalDate value;

    RecordDate() {
    }

    public RecordDate(LocalDate aValue) {
        value = aValue;

    }

    public static RecordDate emptyRecordDate() {
        return new RecordDate();
    }

    public LocalDate asDate() {
        return value;
    }

    @Override
    public String toString() {
        return Objects2.toStringHelper(this)
                .addValue(value)
                .toString();
    }

    @Override
    public boolean sameValueAs(RecordDate other) {
        return Objects2.nonNull(other) && Objects2.equal(value, other.value);
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        RecordDate that;
        if (obj instanceof RecordDate) {
            that = (RecordDate) obj;
            if (Objects2.equal(value, that.value)) return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects2.hash(value);
    }

    public static class RecordDateCriteria implements Predicate<RecordDate> {
        EqualRecordDateCriteria equalRecordDateCriteria = EqualRecordDateCriteria.emptyEqualRecordDateCriteria();

        @Override
        public boolean test(RecordDate recordDate) {
            return equalRecordDateCriteria
                    .test(recordDate);
        }

        RecordDateCriteria equal(RecordDate aRecordDate) {
            equalRecordDateCriteria.setSourceRecordDate(aRecordDate);
            return this;
        }

        public static class EqualRecordDateCriteria implements Predicate<RecordDate> {
            private boolean isEmpty = true;
            private RecordDate sourceRecordDate = null;

            public static EqualRecordDateCriteria emptyEqualRecordDateCriteria() {
                return new EqualRecordDateCriteria();
            }


            @Override
            public boolean test(RecordDate recordDate) {
                if (isEmpty) return true;
                return sourceRecordDate.sameValueAs(recordDate);
            }

            public void setSourceRecordDate(RecordDate aRecordDate) {
                sourceRecordDate = aRecordDate;
                isEmpty = false;
            }
        }
    }
}
