package org.venuspj.studio.fundamentals.breadcrumbs;

import org.junit.Test;
import org.venuspj.studio.generic.fundamentals.caption.Caption;
import org.venuspj.studio.generic.fundamentals.url.Uri;

import static org.assertj.core.api.Java6Assertions.*;

public class BreadcrumbTest {
    @Test
    public void toString1() throws Exception {
        Breadcrumb target = new Breadcrumb(new Caption("caption"), new Uri("/path"));
        System.out.println(target.toString());

    }

    @Test
    public void hashCode1() throws Exception {
        Breadcrumb target = new Breadcrumb(new Caption("caption"), new Uri("/path"));
        System.out.println(target.hashCode());
        assertThat(target.hashCode())
                .isEqualTo(2004584243);
    }

    @Test
    public void equals1() throws Exception {
        Breadcrumb target = new Breadcrumb(new Caption("caption"), new Uri("/path"));
        System.out.println(target.hashCode());
        assertThat(target.equals(target))
                .isTrue();
    }

    @Test
    public void equals2() throws Exception {
        Breadcrumb target = new Breadcrumb(new Caption("caption"), new Uri("/path"));
        assertThat(target.equals(null))
                .isFalse();
    }

    @Test
    public void equals3() throws Exception {
        Breadcrumb target = new Breadcrumb(new Caption("caption"), new Uri("/path"));
        Breadcrumb other = new Breadcrumb(new Caption("caption"), new Uri("/path"));
        assertThat(target.equals(other))
                .isTrue();
    }

    @Test
    public void equals4() throws Exception {
        Breadcrumb target = new Breadcrumb(new Caption("caption"), new Uri("/path"));
        Breadcrumb other = new Breadcrumb(new Caption("caption"), null);
        assertThat(target.equals(other))
                .isFalse();
    }

    @Test
    public void equals5() throws Exception {
        Breadcrumb target = new Breadcrumb(new Caption("caption"), new Uri("/path"));
        Breadcrumb other = new Breadcrumb(null, new Uri("/path"));
        assertThat(target.equals(other))
                .isFalse();
    }

    @Test
    public void equals6() throws Exception {
        Breadcrumb target = new Breadcrumb(new Caption("caption"), new Uri("/path"));
        Breadcrumb other = new Breadcrumb(null, null);
        assertThat(target.equals(other))
                .isFalse();
    }

}