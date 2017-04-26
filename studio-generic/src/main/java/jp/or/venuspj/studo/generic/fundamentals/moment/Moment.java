package jp.or.venuspj.studo.generic.fundamentals.moment;

import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDatetime;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * 瞬間を示す
 */
public class Moment implements Value, DecidableSameValueAs<Moment> {
    RecordDatetime recordDatetime;

    public Moment(RecordDatetime aRecordDatetime) {
        recordDatetime = aRecordDatetime;
    }

    @Override
    public boolean sameValueAs(Moment other) {
        return Objects2.nonNull(other) && Objects2.equal(recordDatetime, other.recordDatetime);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(recordDatetime)
                .toString();
    }
}
