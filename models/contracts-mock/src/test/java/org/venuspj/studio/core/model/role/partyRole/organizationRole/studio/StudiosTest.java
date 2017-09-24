package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class StudiosTest {

    @Test
    public void asList() {
        Studios target = StudiosMock.createDummy();
        List<Studio> actual = target.asList();
        assertThat(actual).isNotNull();
        System.out.println(actual);
        assertThat(actual.size())
                .isEqualTo(1);

    }

    @Test
    public void toString1() {
        Studios target = StudiosMock.createDummy();
        String actual = target.toString();
        assertThat(actual).isNotNull();
        System.out.println(actual);

    }

    @Test
    public void empty() {
        Studios target = Studios.emptyStudios();
        boolean actual = target.isEmpty();
        assertThat(actual).isNotNull()
                .isTrue();
        System.out.println(actual);


    }

}
