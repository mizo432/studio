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

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
    private void setLocalDateTime(LocalDateTime aLocalDateTime) {
        StaticDateProvider.localDateTime = aLocalDateTime;
    }

    @Override
    protected LocalDateTime currentLocalDateTime() {
        return localDateTime;
    }

}
