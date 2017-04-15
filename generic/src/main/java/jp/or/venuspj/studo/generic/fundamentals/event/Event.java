package jp.or.venuspj.studo.generic.fundamentals.event;

import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.studo.authentication.model.UserId;
import jp.or.venuspj.studo.generic.fundamentals.moment.Moment;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.Objects;

/**
 * Created by mizoguchi on 2017/03/25.
 */
public class Event implements Value, DecidableSameValueAs<Event> {
    Moment moment;
    UserId userId;

    public Event(Moment aMoment, UserId anUserId) {
        moment = aMoment;
        userId = anUserId;

    }

    @Override
    public boolean sameValueAs(Event other) {
        return Objects.nonNull(other) &&
                moment.sameValueAs(other.moment) &&
                userId.sameValueAs(other.userId);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("moment", moment)
                .add("userId", userId)
                .omitNullValues()
                .toString();
    }
}
