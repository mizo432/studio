package org.venuspj.ddd.model.criteria.datetime;

import org.junit.Test;
import org.slf4j.Logger;
import org.venuspj.util.dateProvider.DateProvider;

import static org.venuspj.util.logger.LoggerFactory.*;
import static org.venuspj.util.objects2.Objects2.*;

public class YearMonthCriteriaTest {
    private static final Logger LOGGER = getLogger();

    @Test
    public void constructor() {
        YearMonthCriteria target = new YearMonthCriteria();
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void graterThan() {
        YearMonthCriteria target = new YearMonthCriteria();
        target.graterThan(DateProvider.currentYearMonth());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void graterThanOrEqual() {
        YearMonthCriteria target = new YearMonthCriteria();
        target.graterThanOrEqual(DateProvider.currentYearMonth());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void smallerThan() {
        YearMonthCriteria target = new YearMonthCriteria();
        target.smallerThan(DateProvider.currentYearMonth());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void smallerThanOrEqual() {
        YearMonthCriteria target = new YearMonthCriteria();
        target.smallerThanOrEqual(DateProvider.currentYearMonth());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void between() {
        YearMonthCriteria target = new YearMonthCriteria();
        target.between(DateProvider.currentYearMonth(), DateProvider.currentYearMonth());
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

}