package org.venuspj.util.dateProvider;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicReference;

/**
 */
public class DateProvider {

    private static AtomicReference<DateProvider> dateProvider = new AtomicReference<>(new DateProvider());

    DateProvider() {

    }

    protected DateProvider(DateProvider aDateProvider) {
        DateProvider.setDateProvider(aDateProvider);
    }

    public static void setDateProvider(DateProvider aDateProvider) {
        DateProvider.dateProvider.set(aDateProvider);
    }

    public static LocalDateTime currentDateTime() {
        return DateProvider.dateProvider.get().currentLocalDateTime();
    }

    protected LocalDateTime currentLocalDateTime() {
        return LocalDateTime.now();
    }

}
