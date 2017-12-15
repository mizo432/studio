package org.venuspj.studio.web.controller.events;

import org.junit.Test;
import org.venuspj.studio.core.model.event.EventIdentifier;

import static org.assertj.core.api.Java6Assertions.*;

public class EventControllerTest {

    public static class EventQueryCriteriaTest {

        @Test
        public void getEventId() throws Exception {
            EventController.EventQueryCriteria target = new EventController.EventQueryCriteria(1);
            EventIdentifier actual = target.getEventIdentifier();
            assertThat(actual).isNotNull();
            System.out.println(actual);
        }

    }
}
