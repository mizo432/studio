package org.venuspj.ddd.model.value;

import java.time.YearMonth;

/**
 * Created by mizoguchi on 2017/02/14.
 */
public interface YearMonthValue {
    YearMonth asYearMonth();
    String asText();
}
