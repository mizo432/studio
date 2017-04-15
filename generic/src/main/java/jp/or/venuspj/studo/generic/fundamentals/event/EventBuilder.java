package jp.or.venuspj.studo.generic.fundamentals.event;

import jp.or.venuspj.studo.authentication.model.UserId;
import jp.or.venuspj.studo.generic.fundamentals.moment.Moment;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/03/25.
 */
public class EventBuilder extends ObjectBuilder<Event, EventBuilder> {
    Moment moment;
    UserId userId;

    @Override
    protected void apply(Event vo, EventBuilder builder) {
        builder.withMoment(vo.moment);
        builder.withUserId(vo.userId);
    }

    public EventBuilder withUserId(UserId anUserId) {
        if (Objects2.nonNull(anUserId))
            addConfigurator(builder -> builder.userId = anUserId);
        return getThis();
    }

    public EventBuilder withMoment(Moment aMoment) {
        if (Objects2.nonNull(aMoment))
            addConfigurator(builder -> builder.moment = aMoment);
        return getThis();
    }

    @Override
    protected Event createValueObject() {
        return new Event(moment, userId);
    }

    @Override
    protected EventBuilder getThis() {
        return this;
    }

    @Override
    protected EventBuilder newInstance() {
        return new EventBuilder();
    }
}
