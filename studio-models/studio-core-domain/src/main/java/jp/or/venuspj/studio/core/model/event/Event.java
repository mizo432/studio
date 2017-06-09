package jp.or.venuspj.studio.core.model.event;

import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class Event {
    EventId eventId;
    Event(){

    }
    public Event(EventId anEventId){
        eventId = anEventId;

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("eventId",eventId)
                .omitNullValues()
                .toString();
    }
}
