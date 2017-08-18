package org.venuspj.todox.core.model.project;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ProjectIdTest {

    @Test
    public void sameValueAs1() throws Exception {
        ProjectId target = ProjectIdMock.createDummy(ProjectMock.ProjectType.DEFAULT);
        boolean actual = target.sameValueAs(target);
        assertThat(actual)
                .isEqualTo(true);

    }

    @Test
    public void toString1() throws Exception {
        ProjectId target = ProjectIdMock.createDummy(ProjectMock.ProjectType.DEFAULT);
        String actual = target.toString();
        assertThat(actual)
                .isEqualTo("ProjectId{kind=org.venuspj.todox.core.model.project.Project, value=1}");

    }
}
