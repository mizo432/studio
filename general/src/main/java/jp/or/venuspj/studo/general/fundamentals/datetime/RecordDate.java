package jp.or.venuspj.studo.general.fundamentals.datetime;

import jp.or.venuspj.util.objects2.Objects2;

import java.time.LocalDate;

public class RecordDate {
    private LocalDate value;

    RecordDate(){
    }
    public RecordDate(LocalDate aValue){
        value = aValue;

    }

    public LocalDate asDate(){
        return value;
    }

    @Override
    public String toString() {
        return Objects2.toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
