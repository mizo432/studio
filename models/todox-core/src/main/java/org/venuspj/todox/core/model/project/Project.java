package org.venuspj.todox.core.model.project;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.todox.core.model.project.configuration.ProjectConfiguration;
import org.venuspj.todox.core.model.sprint.SprintIds;
import org.venuspj.todox.core.model.team.TeamIds;
import org.venuspj.todox.core.model.team.member.MemberIds;

import static org.venuspj.util.objects2.Objects2.*;

public class Project extends AbstractEntity<Project> {

    private ProjectDescription projectDescription = ProjectDescription.empty();
    private ProjectConfiguration projectConfiguration;
    private MemberIds memberIds = MemberIds.empty();
    private TeamIds teamIds = TeamIds.empty();
    private SprintIds sprintIds = SprintIds.empty();

    Project() {

    }

    public Project(ProjectId aProjectId, ProjectDescription aProjectDescription, ProjectConfiguration aProjectConfiguration, MemberIds anyMemberIds, TeamIds anyTeamIds, SprintIds anySprintIds) {
        super(aProjectId);
        projectDescription = aProjectDescription;
        memberIds = anyMemberIds;
        projectConfiguration = aProjectConfiguration;
        teamIds = anyTeamIds;
        sprintIds = anySprintIds;

    }

    public boolean sameIdentifierAs(Project target) {
        return identifier().equals(target.identifier());
    }

    public boolean sameValueAs(Project other) {
        return equals(other);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (isNull(obj)) return false;
        if (!(obj instanceof Project)) return false;
        Project that = (Project) obj;
        return sameIdentifierAs(that) &&
                equal(projectConfiguration, that.projectDescription) &&
                equal(projectConfiguration, that.projectConfiguration) &&
                equal(memberIds, that.memberIds) &&
                equal(teamIds, that.teamIds) &&
                equal(sprintIds, that.sprintIds);
    }

    @Override
    public String toString() {
        return string()
                .add("projectDescription", projectDescription)
                .add("projectConfiguration", projectConfiguration)
                .add("memberIds", memberIds)
                .add("teamIds", teamIds)
                .add("sprintIds", sprintIds)
                .omitNullValues()
                .toString();
    }
}
