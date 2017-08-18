package org.venuspj.todox.core.model.project;

public class ProjectMock {
    public static Project createDummy() {
        return new Project();
    }

    public static Project createDummy(ProjectType aProjectType) {
        return new Project(ProjectIdMock.createDummy(aProjectType),ProjectDescriptionMock.createDummy(aProjectType), null);
    }

    public enum ProjectType {
        DEFAULT {
            @Override
            public Integer idValue() {
                return 1;
            }
        };

        public abstract Integer idValue();
    }
}
