package root.general.domain.fundamentals;

import jp.or.venuspj.ddd.model.value.YearMonthValue;
import jp.or.venuspj.util.objects2.Objects2;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

/**
 * Created by mizoguchi on 2017/02/14.
 */
public class RecordYearMonth implements YearMonthValue {
    private YearMonth value;

    RecordYearMonth() {
    }

    public RecordYearMonth(YearMonth aValue) {
        value = aValue;
    }

    @Override
    public YearMonth asYearMonth() {
        return value;
    }

    @Override
    public String asText() {
        return value.format(DateTimeFormatter.ofPattern("yyyyMM"));
    }

    @Override
    public String toString() {
        return Objects2.toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
