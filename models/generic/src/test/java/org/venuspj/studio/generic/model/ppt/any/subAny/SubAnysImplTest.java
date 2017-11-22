package org.venuspj.studio.generic.model.ppt.any.subAny;

import org.junit.Test;
import org.slf4j.Logger;

import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class SubAnysImplTest {
    private static final Logger LOGGER = getLogger();

    @Test
    public void asList() throws Exception {

        SubAny<?> subany = new SubAnyImpl(new SubAnyIdentifier(1));
        List<SubAny> list = newArrayList(subany);
        SubAnys target = new SubAnysImpl(list);
        LOGGER.debug("target:{}", toStringHelper(target)
                .addAllDeclaredFields()
                .omitNullValues()
                .multiLine()
                .toString());
        List<SubAny<?>> actual = target.asList();
        LOGGER.debug("actual:{}", actual);
    }

    @Test
    public void iterator() throws Exception {
        SubAny subany = new SubAnyImpl(new SubAnyIdentifier(1));
        List<SubAny> list = newArrayList(subany);
        SubAnys target = new SubAnysImpl(list);
        for (SubAny<?> element:target) {
            LOGGER.debug("element:{}", toStringHelper(element)
                    .addAllDeclaredFields()
                    .omitNullValues()
                    .multiLine()
                    .toString());

        }
    }

}