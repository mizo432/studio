package jp.or.venuspj.studo.generic.fundamentals.datetime;

import java.time.LocalDateTime;

public final class StaticDateProvider extends DateProvider {
    private static LocalDateTime localDateTime = null;

    private StaticDateProvider(){

    }

    public static void initialize(LocalDateTime aLocalDateTime){
        StaticDateProvider instance = new StaticDateProvider();
        instance.setLocalDateTime(aLocalDateTime);
        DateProvider.setDateProvider(instance);


    }

    private void setLocalDateTime(LocalDateTime aLocalDateTime) {
        StaticDateProvider.localDateTime = aLocalDateTime;
    }

    @Override
    protected LocalDateTime currentLocalDateTime() {
        return localDateTime;
    }

}
