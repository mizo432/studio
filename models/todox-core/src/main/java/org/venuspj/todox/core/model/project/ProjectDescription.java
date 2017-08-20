package org.venuspj.todox.core.model.project;

public class ProjectDescription {
    ProjectKey projectKey;
    Vision vision;


    public static ProjectDescription empty() {
        return new ProjectDescription();
    }

}
