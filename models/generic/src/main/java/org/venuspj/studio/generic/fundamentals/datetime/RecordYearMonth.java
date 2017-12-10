package org.venuspj.studio.generic.fundamentals.datetime;

import org.venuspj.ddd.model.value.DecidableSameValueAs;
import org.venuspj.ddd.model.value.Value;

import java.time.YearMonth;
import java.util.function.Predicate;

import static org.venuspj.util.objects2.Objects2.*;

public class RecordYearMonth implements Value, DecidableSameValueAs<RecordYearMonth> {
    private YearMonth value;

    RecordYearMonth() {

    }

    /**
     * 文字列形式からRecordYearMonthを作成する.
     *
     * @param aValue uuuu-MM形式の文字列
     */
    public RecordYearMonth(String aValue) {
        value = YearMonth.parse(aValue);

    }

    public RecordYearMonth(YearMonth aValue) {
        value = aValue;

    }

    public static RecordYearMonth empty() {
        return new RecordYearMonth();
    }

    public static RecordYearMonth of(int year, int month) {
        return new RecordYearMonth(YearMonth.of(year, month));
    }

    public YearMonth asYearMonth() {
        return value;
    }

    @Override
    public boolean sameValueAs(RecordYearMonth other) {
        return nonNull(other) && value.equals(other.value);
    }

    public boolean isPresent() {
        return nonNull(value);
    }

    public static class RecordYearMonthCriteria implements Predicate<RecordYearMonth> {
        RecordYearMonth.RecordYearMonthCriteria.EqualRecordYearMonthCriteria equalRecordYearMonthCriteria = RecordYearMonthCriteria.EqualRecordYearMonthCriteria.emptyEqualRecordYearMonthCriteria();

        @Override
        public boolean test(RecordYearMonth aRecordYearMonth) {
            return equalRecordYearMonthCriteria
                    .test(aRecordYearMonth);
        }

        public RecordYearMonth.RecordYearMonthCriteria equal(RecordYearMonth aRecordYearMonth) {
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
