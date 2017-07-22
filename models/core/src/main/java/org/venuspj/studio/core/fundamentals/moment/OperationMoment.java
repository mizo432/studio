package org.venuspj.studio.core.fundamentals.moment;

import org.venuspj.studio.core.model.role.partyRole.operator.OperatorId;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDateTime;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class OperationMoment {
    RecordDateTime recordDateTime = new RecordDateTime();
    OperatorId operatorId = OperatorId.EMPTY;

    OperationMoment() {

    }

    public OperationMoment(RecordDateTime aRecordDateTime, OperatorId anOperatorId) {
        recordDateTime = aRecordDateTime;
        operatorId = anOperatorId;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("recordDateTime", recordDateTime)
                .add("operatorId", operatorId)
                .omitNullValues()
                .toString();
    }

    public boolean isPrecent() {
        return recordDateTime.isPresent() || operatorId.isPresent();

    }
}
