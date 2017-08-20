package org.venuspj.todox.core.model.team.configuration;

import org.venuspj.util.objects2.Objects2;

public class TeamConfiguration {
    AutoAssignTeamMemberOnCreate autoAssignTeamMemberOnCreate;

    TeamConfiguration(AutoAssignTeamMemberOnCreate anAutoAssignTeamMemberOnCreate) {
        autoAssignTeamMemberOnCreate = anAutoAssignTeamMemberOnCreate;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("autoAssignTeamMemberOnCreate", autoAssignTeamMemberOnCreate)
                .omitNullValues()
                .toString();
    }
}
