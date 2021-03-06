package org.venuspj.studio.core.model.role.partyRole.operator;

import org.venuspj.util.objects2.Objects2;

public class Operator {
    private OperatorId operatorId = new OperatorId();

    Operator() {
    }

    public Operator(OperatorId anOperatorId) {
        operatorId = anOperatorId;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("operatorId", operatorId)
                .omitNullValues()
                .toString();
    }
}
