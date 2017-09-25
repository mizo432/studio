package org.venuspj.studio.generic.fundamentals.address.prefecture;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.venuspj.util.collect.Lists2.newArrayList;

public class PrefecturesText {
    @Test
    public void allPrefectures() throws Exception {
        Prefectures target = Prefectures.allPrefecture();
        assertThat(target.list.size())
                .isNotNull()
                .isEqualTo(47);

    }

    @Test
    public void toString1() throws Exception {
        Prefectures target = Prefectures.allPrefecture();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }
    @Test
    public void toString2() throws Exception {
        Prefectures target = new Prefectures(newArrayList());
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }
}
