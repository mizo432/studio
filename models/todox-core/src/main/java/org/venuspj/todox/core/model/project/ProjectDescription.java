package org.venuspj.todox.core.model.project;

import org.venuspj.util.objects2.Objects2;

public class ProjectDescription {
    ProjectKey projectKey = ProjectKey.empty();
    Vision vision = Vision.empty();

    public ProjectDescription(ProjectKey aProjectKey, Vision aVision) {
        projectKey = aProjectKey;
        vision = aVision;
    }

    private ProjectDescription() {

    }

    public static ProjectDescription empty() {
        return new ProjectDescription();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("projectKey", projectKey)
                .add("vision", vision)
                .omitNullValues()
                .toString();
    }
}
