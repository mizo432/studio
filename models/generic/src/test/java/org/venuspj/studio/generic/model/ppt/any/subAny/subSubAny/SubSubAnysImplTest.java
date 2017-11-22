package org.venuspj.studio.generic.model.ppt.any.subAny.subSubAny;

import org.junit.Test;
import org.slf4j.Logger;

import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class SubSubAnysImplTest {
    private static final Logger LOGGER = getLogger();

    @Test
    public void asList() throws Exception {

        SubSubAny subSubAny = new SubSubAnyImpl(new SubSubAnyIdentifier(1));
        List<SubSubAny> list = newArrayList(subSubAny);
        SubSubAnys target = new SubSubAnysImpl(list);
        LOGGER.debug("target:{}", toStringHelper(target)
                .addAllDeclaredFields()
                .omitNullValues()
                .multiLine()
                .toString());
        List<SubSubAny> actual = target.asList();
        LOGGER.debug("actual:{}", actual);
    }

    @Test
    public void iterator() throws Exception {
        SubSubAny subany = new SubSubAnyImpl(new SubSubAnyIdentifier(1));
        List<SubSubAny> list = newArrayList(subany);
        SubSubAnys target = new SubSubAnysImpl(list);
        for (SubSubAny element:target) {
            LOGGER.debug("element:{}", toStringHelper(element)
                    .addAllDeclaredFields()
                    .omitNullValues()
                    .multiLine()
                    .toString());

        }
    }

}