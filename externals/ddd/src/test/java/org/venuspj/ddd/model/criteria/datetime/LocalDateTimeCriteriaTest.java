package org.venuspj.ddd.model.criteria.datetime;

import org.junit.Test;
import org.slf4j.Logger;
import org.venuspj.util.dateProvider.DateProvider;

import static org.venuspj.util.logger.LoggerFactory.*;
import static org.venuspj.util.objects2.Objects2.*;

public class LocalDateTimeCriteriaTest {
    private static final Logger LOGGER = getLogger();

    @Test
    public void constructor() {
        LocalDateTimeCriteria target = new LocalDateTimeCriteria();
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void graterThan() {
        LocalDateTimeCriteria target = new LocalDateTimeCriteria();
        target.graterThan(DateProvider.currentDateTime());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void graterThanOrEqual() {
        LocalDateTimeCriteria target = new LocalDateTimeCriteria();
        target.graterThanOrEqual(DateProvider.currentDateTime());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void smallerThan() {
        LocalDateTimeCriteria target = new LocalDateTimeCriteria();
        target.smallerThan(DateProvider.currentDateTime());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void smallerThanOrEqual() {
        LocalDateTimeCriteria target = new LocalDateTimeCriteria();
        target.smallerThanOrEqual(DateProvider.currentDateTime());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void between() {
        LocalDateTimeCriteria target = new LocalDateTimeCriteria();
        target.between(DateProvider.currentDateTime(), DateProvider.currentDateTime());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

}