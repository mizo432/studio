package jp.or.venuspj.studio.core.model.event;

import jp.or.venuspj.util.objects2.Objects2;

public class EventImpl implements Event {
    EventImpl(){

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .toString();
    }
}
