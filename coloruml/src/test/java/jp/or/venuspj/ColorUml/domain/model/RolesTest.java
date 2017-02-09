package jp.or.venuspj.ColorUml.domain.model;

import com.google.common.collect.Lists;
import jp.or.venuspj.ColorUml.domain.model.role.RolesImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kenichimizoguchi on 2017/02/09.
 */
public class RolesTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(RolesTest.class);

    public static class BuilderText {

        @Test
        public void test01() {
            Roles actual = RolesTest.createDummy();
            LOGGER.debug("actual:" + actual);

        }

    }

    public static Roles createDummy() {
        return new RolesImpl(Lists.newArrayList());
    }

}