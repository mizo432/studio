package org.venuspj.util.dateProvider;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicReference;

/**
 */
public class StaticDateProvider extends DateProvider {
    private static AtomicReference<LocalDateTime> localDateTime = new AtomicReference<LocalDateTime>();

    private StaticDateProvider() {

    }

    public static void initialize(LocalDateTime aLocalDateTime) {
        StaticDateProvider instance = new StaticDateProvider();
        instance.setLocalDateTime(aLocalDateTime);
        DateProvider.setDateProvider(instance);


    }

    private void setLocalDateTime(LocalDateTime aLocalDateTime) {
        StaticDateProvider.localDateTime.set(aLocalDateTime);
    }

    @Override
    protected LocalDateTime currentLocalDateTime() {
        return localDateTime.get();
    }

}
