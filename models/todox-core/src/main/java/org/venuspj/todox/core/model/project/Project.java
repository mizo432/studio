package org.venuspj.todox.core.model.project;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.todox.core.model.team.member.MemberIds;

public class Project extends AbstractEntity<Project> {

    private ProjectDescription projectDescription = ProjectDescription.empty();
    private MemberIds memberIds = MemberIds.empty();

    Project() {

    }

    public Project(ProjectId aProjectId, ProjectDescription aProjectDescription, MemberIds amyMemberIds) {
        super(aProjectId);
        projectDescription = aProjectDescription;
        memberIds = amyMemberIds;

    }

    public boolean sameIdentifierAs(Project target) {
        return identifier().equals(target.identifier());
    }

    @Override
    public String toString() {
        return string()
                .add("projectDescription", projectDescription)
                .add("memberIds", memberIds)
                .omitNullValues()
                .toString();
    }
}
