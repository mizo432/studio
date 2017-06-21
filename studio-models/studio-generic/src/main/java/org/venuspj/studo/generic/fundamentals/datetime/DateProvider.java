package org.venuspj.studo.generic.fundamentals.datetime;

import java.time.LocalDateTime;

public class DateProvider {

    private static DateProvider dateProvider = new DateProvider();

    DateProvider() {

    }


    public static RecordDatetime currentDatetime() {
        return new RecordDatetime(dateProvider.currentLocalDateTime());
    }

    public static RecordDate currentDate() {
        RecordDatetime dateTime = currentDatetime();
        return dateTime.asDate();
    }

    public static RecordTime currentTime() {
        RecordDatetime dateTime = currentDatetime();
        return dateTime.asTime();
    }

    public static void setDateProvider(DateProvider aDateProvider) {
        DateProvider.dateProvider = aDateProvider;

    }

    protected LocalDateTime currentLocalDateTime() {
        return LocalDateTime.now();
    }

}
