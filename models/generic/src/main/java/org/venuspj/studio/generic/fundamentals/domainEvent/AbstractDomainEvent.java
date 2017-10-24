package org.venuspj.studio.generic.fundamentals.domainEvent;

import org.venuspj.studio.generic.fundamentals.moment.Moment;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public abstract class AbstractDomainEvent {
    protected Moment occurredMoment = Moment.emptyMoment();

    public AbstractDomainEvent(Moment anOccurredMoment) {
        occurredMoment = anOccurredMoment;
    }

    protected Objects2.ToStringHelper string() {
        return toStringHelper(this)
                .add("occurredMoment", occurredMoment);

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
