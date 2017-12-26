package org.venuspj.studio.adapter.presenters.event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.venuspj.studio.core.model.event.EventMock;
import org.venuspj.studio.core.model.event.EventsMock;
import org.venuspj.studio.core.model.role.thingRole.ProductsMock;
import org.venuspj.studio.view.event.EventPage;

import static org.venuspj.util.logger.LoggerFactory.*;
import static org.venuspj.util.objects2.Objects2.*;

public class EventPagePresenterTest {
    private static final Logger LOGGER = getLogger();

    EventPagePresenter eventPagePresenter;


    @Before
    public void setUp() throws Exception {
        eventPagePresenter = new EventPagePresenter();
    }

    @After
    public void tearDown() throws Exception {
        eventPagePresenter = null;
    }

    @Test
    public void createView() throws Exception {
        eventPagePresenter.setEvent(EventMock.createDummy(EventMock.EventType.EVENT_ON_END_OF_LAST_MONTH));
        eventPagePresenter.setEvents(EventsMock.createDummy(EventsMock.MockType.DEFAULT));
        eventPagePresenter.setProducts(ProductsMock.createDummy(ProductsMock.MockType.ALL));
        EventPage actual = eventPagePresenter.createView();
        LOGGER.debug("actual:{}", toStringHelper(actual).defaultConfig().toString());
    }
}
