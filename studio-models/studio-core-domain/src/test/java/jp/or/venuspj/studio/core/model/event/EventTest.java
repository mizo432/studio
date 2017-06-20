package jp.or.venuspj.studio.core.model.event;

import jp.or.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import jp.or.venuspj.studio.core.fundamentals.name.Name;
import jp.or.venuspj.studio.core.model.event.flyers.Flyer;
import jp.or.venuspj.studio.core.model.event.flyers.Flyers;
import jp.or.venuspj.studio.core.model.player.PlayerIds;
import jp.or.venuspj.studo.generic.fundamentals.datetime.DateProvider;
import jp.or.venuspj.studo.generic.fundamentals.datetime.StaticDateProvider;
import jp.or.venuspj.studo.generic.fundamentals.description.Description;
import jp.or.venuspj.util.list2.Lists2;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class EventTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventTest.class);

    @Test
    public void testToString1() throws Exception {
        Event target = new Event();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Event{eventId=EventId{null}, descriptor=Descriptor{name=Name{null}, description=Description{null}}, recordDate=RecordDate{null}, flyers=Flyers{[]}, playerIds=PlayerIds{[]}}");
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017,6,1,0,0,0,0));
        Event target = new Event(new EventId(1), new Descriptor(new Name("イベント名"), new Description("")), new Flyers(Lists2.newArrayList(Flyer.emptyFlyer())), PlayerIds.empty(),DateProvider.currentDate());
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Event{eventId=EventId{1}, descriptor=Descriptor{name=Name{イベント名}, description=Description{}}, recordDate=RecordDate{2017-06-01}, flyers=Flyers{[Flyer{caption=Caption{null}, imagePath=ImagePath{null}}]}, playerIds=PlayerIds{[]}}");

        LOGGER.debug("actual:" + target.toString());
    }

}