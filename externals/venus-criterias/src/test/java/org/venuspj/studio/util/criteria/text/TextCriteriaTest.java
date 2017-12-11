package org.venuspj.studio.util.criteria.text;

import org.junit.Test;
import org.slf4j.Logger;

import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class TextCriteriaTest {
    private static final Logger LOGGER = getLogger();

    @Test
    public void constructor() {
        TextCriteria target = new TextCriteria();
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig());
    }

    @Test
    public void equal() {
        TextCriteria target = new TextCriteria();
        target.equal("sample");
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void notEqual() {
        TextCriteria target = new TextCriteria();
        target.notEqual("sample");
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void like() {
        TextCriteria target = new TextCriteria();
        target.like("sample");
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void in() {
        TextCriteria target = new TextCriteria();
        target.in(newArrayList("ABC"));
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void isNull() {
        TextCriteria target = new TextCriteria();
        target.isNull(true);
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void isNotNull() {
        TextCriteria target = new TextCriteria();
        target.isNotNull(true);
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

}