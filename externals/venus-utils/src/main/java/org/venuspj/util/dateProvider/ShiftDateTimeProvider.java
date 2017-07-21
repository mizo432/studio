package org.venuspj.util.dateProvider;

import java.time.Duration;
import java.time.LocalDateTime;

public class ShiftDateTimeProvider extends DateProvider {
    private static LocalDateTime startDateTime;
    private static LocalDateTime localDateTime;

    public ShiftDateTimeProvider(LocalDateTime aLocalDateTime) {
        super();
        ShiftDateTimeProvider.localDateTime = aLocalDateTime;
        ShiftDateTimeProvider.startDateTime = LocalDateTime.now();
    }

    public static void initialize(LocalDateTime aLocalDateTime) {
        ShiftDateTimeProvider instance = new ShiftDateTimeProvider(aLocalDateTime);
        new DateProvider(instance);
    }

    protected LocalDateTime now() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        return ShiftDateTimeProvider.localDateTime.plusNanos(Duration.between(ShiftDateTimeProvider.startDateTime, currentDateTime).toNanos());
    }

}
