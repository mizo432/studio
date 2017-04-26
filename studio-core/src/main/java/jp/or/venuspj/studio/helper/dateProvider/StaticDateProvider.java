package jp.or.venuspj.studio.helper.dateProvider;

import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDate;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDateTime;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordTime;

public class StaticDateProvider {
    private static DateProvider dateProvider = new DateProvider();

    public static RecordDate currentDate() {
        return dateProvider.currentDate();
    }

    public static RecordDateTime currentDatetime() {
        return dateProvider.currentDatetime();
    }

    public static RecordTime currentTime() {
        return dateProvider.currentTime();
    }


    public static void setDateProvider(DateProvider dateProvider) {
        StaticDateProvider.dateProvider = dateProvider;
    }
}
