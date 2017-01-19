package jp.or.venuspj.studo.general.fundamentals.datetime;

import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.util.objects2.Objects2;

import java.time.YearMonth;

public class RecordYearMonth implements Value<RecordYearMonth> {
    private YearMonth value;

    RecordYearMonth(){

    }
    public RecordYearMonth(YearMonth aValue){
        value = aValue;

    }

    public YearMonth asYearMonth(){
        return value;
    }

    @Override
    public String toString() {
        return Objects2.toStringHelper(this)
                .addValue(value)
                .toString();
    }

    @Override
    public boolean sameValueAs(RecordYearMonth other) {
        if(Objects2.isNull(other)) return false;
        return value.equals(other.value);
    }
}
