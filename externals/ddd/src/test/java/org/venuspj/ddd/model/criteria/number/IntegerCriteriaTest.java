package org.venuspj.ddd.model.criteria.number;

import org.junit.Test;
import org.slf4j.Logger;

import static org.venuspj.util.logger.LoggerFactory.*;
import static org.venuspj.util.objects2.Objects2.*;

public class IntegerCriteriaTest {
    private static final Logger LOGGER = getLogger();

    @Test
    public void constructor() {
        IntegerCriteria target = new IntegerCriteria();
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void graterThan() {
        IntegerCriteria target = new IntegerCriteria();
        target.graterThan(10);
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void graterThanOrEqual() {
        IntegerCriteria target = new IntegerCriteria();
        target.graterThanOrEqual(10);
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void smallerThan() {
        IntegerCriteria target = new IntegerCriteria();
        target.smallerThan(10);
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void smallerThanOrEqual() {
        IntegerCriteria target = new IntegerCriteria();
        target.smallerThanOrEqual(10);
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void between() {
        IntegerCriteria target = new IntegerCriteria();
        target.between(10, 20);
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
    }

}