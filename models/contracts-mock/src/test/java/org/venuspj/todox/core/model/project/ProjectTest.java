package org.venuspj.todox.core.model.project;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ProjectTest {

    @Test
    public void sameValueAs1() throws Exception {
        Project target = ProjectMock.createDummy(ProjectMock.ProjectType.DEFAULT);
        boolean actual = target.sameIdentifierAs(target);
        assertThat(actual)
                .isEqualTo(true);

    }

    @Test
    public void toString1() throws Exception {
        Project target = ProjectMock.createDummy(ProjectMock.ProjectType.DEFAULT);
        String actual = target.toString();
        assertThat(actual)
                .isEqualTo("Project{identifier=ProjectId{kind=org.venuspj.todox.core.model.project.Project, value=1}, projectDescription=org.venuspj.todox.core.model.project.ProjectDescription@38bc8ab5}");

    }
}
