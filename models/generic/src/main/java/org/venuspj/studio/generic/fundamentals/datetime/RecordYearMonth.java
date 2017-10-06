package org.venuspj.studio.generic.fundamentals.datetime;

import org.venuspj.ddd.model.value.DecidableSameValueAs;
import org.venuspj.ddd.model.value.Value;
import org.venuspj.util.objects2.Objects2;

import java.time.YearMonth;
import java.util.function.Predicate;

public class RecordYearMonth implements Value, DecidableSameValueAs<RecordYearMonth> {
    private YearMonth value;

    RecordYearMonth() {

    }

    public RecordYearMonth(YearMonth aValue) {
        value = aValue;

    }

    public YearMonth asYearMonth() {
        return value;
    }

    @Override
    public String toString() {
        return Objects2.toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public boolean sameValueAs(RecordYearMonth other) {
        return Objects2.nonNull(other) && value.equals(other.value);
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }

    public static RecordYearMonth empty() {
        return new RecordYearMonth();
    }

    public static class RecordYearMonthCriteria implements Predicate<RecordYearMonth> {
        RecordYearMonth.RecordYearMonthCriteria.EqualRecordYearMonthCriteria equalRecordYearMonthCriteria = RecordYearMonthCriteria.EqualRecordYearMonthCriteria.emptyEqualRecordYearMonthCriteria();

        @Override
        public boolean test(RecordYearMonth aRecordYearMonth) {
            return equalRecordYearMonthCriteria
                    .test(aRecordYearMonth);
        }

        RecordYearMonth.RecordYearMonthCriteria equal(RecordYearMonth aRecordYearMonth) {
            equalRecordYearMonthCriteria.setSourceRecordDate(aRecordYearMonth);
            return this;
        }

        public static class EqualRecordYearMonthCriteria implements Predicate<RecordYearMonth> {
            private boolean isEmpty = true;
            private RecordYearMonth sourceRecordDate = null;

            public static RecordYearMonth.RecordYearMonthCriteria.EqualRecordYearMonthCriteria emptyEqualRecordYearMonthCriteria() {
                return new RecordYearMonth.RecordYearMonthCriteria.EqualRecordYearMonthCriteria();
            }


            @Override
            public boolean test(RecordYearMonth aRecordYearMonth) {
                if (isEmpty) return true;
                return sourceRecordDate.sameValueAs(aRecordYearMonth);
            }

            public void setSourceRecordDate(RecordYearMonth aRecordYearMonth) {
                sourceRecordDate = aRecordYearMonth;
                isEmpty = false;
            }
        }
    }
}
