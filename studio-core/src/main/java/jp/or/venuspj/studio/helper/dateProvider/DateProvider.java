package jp.or.venuspj.studio.helper.dateProvider;

import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDate;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDatetime;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordTime;
import jp.or.venuspj.util.objects2.Objects2;

import java.time.LocalDateTime;

public class DateProvider {
    private RecordDatetime recordDatetime = null;

    public DateProvider() {

    }

    DateProvider(RecordDatetime aRecordDatetime) {
        recordDatetime = aRecordDatetime;

    }


    public RecordDatetime currentDatetime() {
        if (Objects2.nonNull(recordDatetime)) {
            return recordDatetime;
        }
        return new RecordDatetime(LocalDateTime.now());
    }

    public RecordDate currentDate() {
        RecordDatetime dateTime = currentDatetime();
        return dateTime.asDate();
    }

    public RecordTime currentTime() {
        RecordDatetime dateTime = currentDatetime();
        return dateTime.asTime();
    }
}
