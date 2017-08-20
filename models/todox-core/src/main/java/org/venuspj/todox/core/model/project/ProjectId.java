package org.venuspj.todox.core.model.project;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.util.objects2.Objects2;

public class ProjectId extends AbstractEntityIdentifier<Project> {

    private Integer value;

    ProjectId() {
        super(Project.class);
    }

    ProjectId(Integer aValue) {
        super(Project.class);
        value = aValue;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (o instanceof ProjectId) {
            ProjectId that = (ProjectId) o;
            return Objects2.equal(value, that.value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects2.hash(kind, value);
    }

    public boolean sameValueAs(ProjectId aProjectId) {
        return equals(aProjectId);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("kind",kind)
                .add("value",value)
                .omitNullValues()
                .toString();
    }
}
