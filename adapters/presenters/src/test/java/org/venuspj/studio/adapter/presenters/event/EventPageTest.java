package org.venuspj.studio.adapter.presenters.event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 */
public class EventPageTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventPageTest.class);
    EventPage eventPage;


    @Before
    public void setUp() throws Exception {
        eventPage = new EventPage();
    }

    @After
    public void tearDown() throws Exception {
        eventPage = null;
    }

    @Test
    public void withEvent() throws Exception {
        eventPage.setEvent(EventMock.createDummy());
        String actual = eventPage.toString();
        LOGGER.debug("actual:" + actual);
    }

    @Test
    public void toString01() throws Exception {
        String actual = eventPage.toString();
        LOGGER.debug("actual:" + actual);
    }

}