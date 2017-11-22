package org.venuspj.studio.generic.model.ppt.any;

import org.junit.Test;
import org.slf4j.Logger;
import org.venuspj.studio.generic.model.ppt.any.subAny.SubAny;
import org.venuspj.studio.generic.model.ppt.any.subAny.SubAnyIdentifier;
import org.venuspj.studio.generic.model.ppt.any.subAny.SubAnyImpl;
import org.venuspj.studio.generic.model.ppt.any.subAny.subSubAny.SubSubAny;
import org.venuspj.studio.generic.model.ppt.any.subAny.subSubAny.SubSubAnyIdentifier;
import org.venuspj.studio.generic.model.ppt.any.subAny.subSubAny.SubSubAnyImpl;

import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class AnysImplTest {
    private static final Logger LOGGER = getLogger();

    @Test
    public void asList1() throws Exception {

        Any any = new AnyImpl(new AnyIdentifier(1));
        List<Any> list = newArrayList(any);
        Anys target = new AnysImpl(list);
        LOGGER.debug("target:{}", toStringHelper(target)
                .addAllDeclaredFields()
                .omitNullValues()
                .multiLine()
                .toString());
        List<Any> actual = target.asList();
        LOGGER.debug("actual:{}", actual);
    }

    @Test
    public void asList2() throws Exception {

        Any any = new AnyImpl(new AnyIdentifier(1));
        SubAny subany = new SubAnyImpl(new SubAnyIdentifier(1));
        SubSubAny subSubAny = new SubSubAnyImpl(new SubSubAnyIdentifier(1));
        List<Any> list = newArrayList(any, subany,subSubAny);
        Anys target = new AnysImpl(list);
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig().toString());
        List<Any> actual = target.asList();
        LOGGER.debug("actual:{}", actual);
    }

    @Test
    public void iterator1() throws Exception {
        Any any = new AnyImpl(new AnyIdentifier(1));
        List<Any> list = newArrayList(any);
        Anys target = new AnysImpl(list);
        for (Any element : target) {
            LOGGER.debug("element:{}", toStringHelper(element).defaultConfig().toString());

        }
    }

    @Test
    public void iterator2() throws Exception {
        Any any = new AnyImpl(new AnyIdentifier(1));
        SubAny subany = new SubAnyImpl(new SubAnyIdentifier(1));
        SubSubAny subSubAny = new SubSubAnyImpl(new SubSubAnyIdentifier(1));
        List<Any> list = newArrayList(any, subany,subSubAny);
        Anys target = new AnysImpl(list);
        for (Any element : target) {
            LOGGER.debug("element:{}", toStringHelper(element)
                    .addAllDeclaredFields()
                    .omitNullValues()
                    .multiLine()
                    .toString());

        }
    }

}