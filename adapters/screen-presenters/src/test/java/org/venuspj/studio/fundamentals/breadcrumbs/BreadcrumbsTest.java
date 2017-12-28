package org.venuspj.studio.fundamentals.breadcrumbs;

import org.junit.Test;
import org.venuspj.studio.generic.fundamentals.caption.Caption;
import org.venuspj.studio.generic.fundamentals.url.Uri;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class BreadcrumbsTest {
    @Test
    public void toString1() throws Exception {
        List<Breadcrumb> list = newArrayList();
        Breadcrumb line1 = new Breadcrumb(new Caption("home"), new Uri("/"));
        list.add(line1);
        Breadcrumb line2 = new Breadcrumb(new Caption("sub"), new Uri("/sub/"));
        list.add(line2);
        Breadcrumbs target = new Breadcrumbs(list);
        System.out.println(target.toString());
    }

}