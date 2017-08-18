package org.venuspj.todox.core.model.project;

public class ProjectIdMock {
    public static ProjectId createDummy(ProjectMock.ProjectType aProjectType) {
        return new ProjectId(aProjectType.idValue());
    }
}
