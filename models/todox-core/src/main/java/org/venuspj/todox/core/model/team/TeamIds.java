package org.venuspj.todox.core.model.team;

import org.venuspj.util.collect.Lists2;

import java.util.List;

public class TeamIds {
    List<TeamId> list = Lists2.newArrayList();

    public TeamIds(List<TeamId> alist) {
        list.addAll(list);
    }

    private TeamIds() {
    }

    public static TeamIds empty() {
        return new TeamIds();
    }
}
