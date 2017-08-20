package org.venuspj.todox.core.model.project;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.todox.core.model.project.configuration.ProjectConfiguration;
import org.venuspj.todox.core.model.team.TeamIds;
import org.venuspj.todox.core.model.team.member.MemberIds;

public class Project extends AbstractEntity<Project> {

    private ProjectDescription projectDescription = ProjectDescription.empty();
    private Vision vision;
    private ProjectConfiguration projectConfiguration;
    private MemberIds memberIds = MemberIds.empty();
    private TeamIds teamIds;

    Project() {

    }

    public Project(ProjectId aProjectId, ProjectDescription aProjectDescription, Vision aVision, ProjectConfiguration aProjectConfiguration, MemberIds anyMemberIds,TeamIds anyTeamIds) {
        super(aProjectId);
        projectDescription = aProjectDescription;
        memberIds = anyMemberIds;
        vision = aVision;
        projectConfiguration = aProjectConfiguration;
        teamIds = anyTeamIds;

    }

    public boolean sameIdentifierAs(Project target) {
        return identifier().equals(target.identifier());
    }

    @Override
    public String toString() {
        return string()
                .add("projectDescription", projectDescription)
                .add("vision", vision)
                .add("projectConfiguration", projectConfiguration)
                .add("memberIds", memberIds)
                .add("teamIds", teamIds)
                .omitNullValues()
                .toString();
    }
}
