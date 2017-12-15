package org.venuspj.studio.core.model.role.partyRole.organizationRole.performer;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;

public class Performers extends AbstractListValue<Performer> {
    public Performers(Collection<? extends Performer> anyCollection) {
        super(anyCollection);

    }

    private Performers() {

    }

    public static Performers empty() {
        return new Performers();
    }
}
