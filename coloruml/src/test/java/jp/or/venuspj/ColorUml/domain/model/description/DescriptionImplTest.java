package jp.or.venuspj.ColorUml.domain.model.description;

import com.google.common.collect.Lists;
import jp.or.venuspj.ColorUml.domain.fundamentals.Note.Note;
import jp.or.venuspj.ColorUml.domain.model.Description;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.PartyPlaceThingsImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by kenichimizoguchi on 2017/02/08.
 */
public class DescriptionImplTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(DescriptionImplTest.class);

    public static class ToStringTest {

        @Test
        public void test01() {
            Description target = DescriptionImplTest.createDummyDescription();
            LOGGER.debug("target:" + target);
        }

    }

    public static Description createDummyDescription() {
        List list = Lists.newArrayList();
        Note note = new Note("サンプルデータ");

        return (Description) new DescriptionBuilder()
                .withPartyPlaceThings(new PartyPlaceThingsImpl(list))
                .withNote(note)
                .build();
    }
}