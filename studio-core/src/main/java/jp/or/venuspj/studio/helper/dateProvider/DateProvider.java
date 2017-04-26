package jp.or.venuspj.studio.helper.dateProvider;

import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDate;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDateTime;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordTime;
import jp.or.venuspj.util.objects2.Objects2;

import java.time.LocalDateTime;

public class DateProvider {
    private RecordDateTime recordDatetime = null;

    public DateProvider() {

    }

    DateProvider(RecordDateTime aRecordDatetime) {
        recordDatetime = aRecordDatetime;

    }


    public RecordDateTime currentDatetime() {
        if (Objects2.nonNull(recordDatetime)) {
            return recordDatetime;
        }
        return new RecordDateTime(LocalDateTime.now());
    }

    public RecordDate currentDate() {
        RecordDateTime dateTime = currentDatetime();
        return dateTime.asDate();
    }

    public RecordTime currentTime() {
        RecordDateTime dateTime = currentDatetime();
        return dateTime.asTime();
    }
}
