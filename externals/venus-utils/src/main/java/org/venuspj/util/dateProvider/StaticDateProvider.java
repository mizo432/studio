package org.venuspj.util.dateProvider;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class StaticDateProvider extends DateProvider {
    private static LocalDate localDate;

    public StaticDateProvider(LocalDate aLocalDate) {
        super();
        StaticDateProvider.localDate = aLocalDate;
    }

    public static void initialize(LocalDate aLocalDate) {
        StaticDateProvider instance = new StaticDateProvider(aLocalDate);
        new DateProvider(instance);
    }

    protected LocalDateTime now() {
        return LocalDateTime.of(StaticDateProvider.localDate, LocalTime.now());
    }

}
