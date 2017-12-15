package org.venuspj.studio.core.model.role.partyRole.organizationRole.performer;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.*;

public class PerformerTest {
    @Test
    public void emptyPerformer() throws Exception {
        Performer target = Performer.empty();
        System.out.println(target);
    }

    @Test
    public void emptyPerformer1() throws Exception {
        Performer target = PerformerMock.createDummy(PerformerMock.PerformerType.EMPTY);
        System.out.println(target);
    }

    @Test
    public void emptyPerformer2() throws Exception {
        Performer target = PerformerMock.createDummy(PerformerMock.PerformerType.DEEJEY1_EVENT1);
        System.out.println(toStringHelper(target).defaultConfig().toString());

    }

}
