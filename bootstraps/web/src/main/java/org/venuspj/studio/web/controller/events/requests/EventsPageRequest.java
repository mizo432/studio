package org.venuspj.studio.web.controller.events.requests;

import org.venuspj.studio.core.model.event.EventCriteria;
import org.venuspj.studio.core.usecase.event.events.FetchEventsRequest;
import org.venuspj.studio.generic.fundamentals.datetime.RecordYearMonth;

public class EventsPageRequest implements FetchEventsRequest {

    private final RecordYearMonth recordYearMonth;

    public EventsPageRequest(String aEventYearMonth) {
        recordYearMonth = new RecordYearMonth(aEventYearMonth);
    }

    @Override
    public EventCriteria getEventCriteria() {
        EventCriteria result = new EventCriteria();
        return result;
    }
}
