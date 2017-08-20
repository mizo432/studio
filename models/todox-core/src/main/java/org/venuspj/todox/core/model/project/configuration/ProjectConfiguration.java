package org.venuspj.todox.core.model.project.configuration;

import org.venuspj.util.objects2.Objects2;

public class ProjectConfiguration {
    ProjectStartDate projectStartDate;
    ChildConfigurations childConfigurations;
    HideWeekendsInChart hideWeekendsInChart;

    public ProjectConfiguration(ProjectStartDate aProjectStartDate, HideWeekendsInChart aHideWeekendsInChart, ChildConfigurations aChildConfigurations) {
        projectStartDate = aProjectStartDate;
        hideWeekendsInChart = aHideWeekendsInChart;
        childConfigurations = aChildConfigurations;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("projectStartDate", projectStartDate)
                .add("hideWeekendsInChart", hideWeekendsInChart)
                .add("childConfigurations", childConfigurations)
                .omitNullValues()
                .toString();
    }
}
