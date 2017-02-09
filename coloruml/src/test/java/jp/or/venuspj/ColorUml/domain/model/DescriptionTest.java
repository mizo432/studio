package jp.or.venuspj.ColorUml.domain.model;

import jp.or.venuspj.ColorUml.domain.model.description.DescriptionBuilder;
import jp.or.venuspj.util.objects2.Objects2;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 */
public class DescriptionTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(DescriptionTest.class);

    public static class BuilderText {

        @Test
        public void test01() {
            Description actual = DescriptionTest.createDummyDescription();
            LOGGER.debug("actual:" + actual);

        }

    }

    public static Description createDummyDescription() {
        return new DescriptionBuilder()
                .withPartyPlaceThings(PartyPlaceThingsTest.createDummyData())
                .withNote("ノート")
                .withAssessOptional(Optional.of(new Assess() {
                    @Override
                    public boolean assess() {
                        return false;
                    }

                    @Override
                    public String toString() {
                        return Objects2
                                .toStringHelper(this)
                                .toString();
                    }
                }))
                .build();
    }

}