package org.venuspj.todox.core.funcmentals.nameObject;

import org.junit.Test;
import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.studio.generic.fundamentals.name.Name;

import static org.assertj.core.api.Java6Assertions.*;

public class NameObjectTest {

    @Test
    public void defaultNameObject() throws Exception {
        NameObject target = NameObject.defaultNameObject();
        System.out.println(target);
    }

    @Test
    public void isPresent1() throws Exception {
        NameObject target = NameObject.defaultNameObject();
        boolean actual = target.isPresent();
        System.out.println(target);
        assertThat(actual).isFalse();
    }

    @Test
    public void isPresent2() throws Exception {
        NameObject target = new NameObject(new Name("DUMMY"), Description.emptyDescription());
        boolean actual = target.isPresent();
        System.out.println(target);
        assertThat(actual).isTrue();
    }

    @Test
    public void isPresent3() throws Exception {
        NameObject target = new NameObject(Name.defaultName(), new Description("DUMMY"));
        boolean actual = target.isPresent();
        System.out.println(target);
        assertThat(actual).isTrue();
    }
}