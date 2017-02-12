package jp.or.venuspj.ddd.model.value;

import java.time.LocalDate;

/**
 * Created by mizoguchi on 2017/02/12.
 */
public interface DateValue extends ValueObject {
    LocalDate asDate();
}
