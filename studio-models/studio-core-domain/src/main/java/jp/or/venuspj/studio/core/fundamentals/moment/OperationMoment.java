package jp.or.venuspj.studio.core.fundamentals.moment;

import jp.or.venuspj.studio.core.model.operator.OperatorId;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDatetime;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class OperationMoment {
    RecordDatetime recordDatetime = new RecordDatetime();
    OperatorId operatorId = OperatorId.EMPTY;

    OperationMoment() {

    }

    public OperationMoment(RecordDatetime aRecordDateTime, OperatorId anOperatorId) {
        recordDatetime = aRecordDateTime;
        operatorId = anOperatorId;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("recordDatetime",recordDatetime)
                .add("operatorId",operatorId)
                .omitNullValues()
                .toString();
    }

    public boolean isPrecent() {
        return recordDatetime.isPresent() ||operatorId.isPresent();

    }
}
