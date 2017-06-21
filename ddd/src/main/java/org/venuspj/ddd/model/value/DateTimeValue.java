package org.venuspj.ddd.model.value;

import java.time.LocalDateTime;

/**
 */
public interface DateTimeValue extends ValueObject {
    LocalDateTime asDateTime();
}
