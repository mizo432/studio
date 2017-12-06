package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

/**
 */
public class NewsTest {

    @Test
    public void toString1() throws Exception {
        News target = NewsMock.createDummy(NewsMock.NewsType.DEFAULT);
        System.out.println("actual:" + toStringHelper(target).defaultConfig().toString());
    }
}
