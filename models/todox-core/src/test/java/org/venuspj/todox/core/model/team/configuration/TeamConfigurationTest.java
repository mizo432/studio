package org.venuspj.todox.core.model.team.configuration;

import org.junit.Test;

public class TeamConfigurationTest {

    @Test
    public void toString1() throws Exception {
        TeamConfiguration target = new TeamConfiguration(AutoAssignTeamMemberOnCreate.AUTO_ASSIGN);
        System.out.println(target);
    }
}