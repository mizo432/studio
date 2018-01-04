package org.venuspj.studio.adapter.presenters.event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.venuspj.studio.core.model.event.EventMock;
import org.venuspj.studio.view.event.EventViewModel;
import org.venuspj.studio.view.player.players.PlayersViewModel;

import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

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
        EventPage actual = eventPagePresenter.createView();
        actual.setViewModel(new EventViewModel.Builder().build());
        actual.setViewModel(PlayersViewModel.create());
        LOGGER.debug("actual:{}", toStringHelper(actual).defaultConfig().toString());
    }
}
