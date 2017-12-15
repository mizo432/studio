package org.venuspj.ddd.model.criteria.datetime;

import org.junit.Test;
import org.slf4j.Logger;
import org.venuspj.util.dateProvider.DateProvider;

import static org.venuspj.util.logger.LoggerFactory.*;
import static org.venuspj.util.objects2.Objects2.*;

public class LocalDateCriteriaTest {
    private static final Logger LOGGER = getLogger();

    @Test
    public void constructor() {
        LocalDateCriteria target = new LocalDateCriteria();
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void graterThan() {
        LocalDateCriteria target = new LocalDateCriteria();
        target.graterThan(DateProvider.currentDate());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void graterThanOrEqual() {
        LocalDateCriteria target = new LocalDateCriteria();
        target.graterThanOrEqual(DateProvider.currentDate());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void smallerThan() {
        LocalDateCriteria target = new LocalDateCriteria();
        target.smallerThan(DateProvider.currentDate());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void smallerThanOrEqual() {
        LocalDateCriteria target = new LocalDateCriteria();
        target.smallerThanOrEqual(DateProvider.currentDate());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void between() {
        LocalDateCriteria target = new LocalDateCriteria();
        target.between(DateProvider.currentDate(), DateProvider.currentDate());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

}