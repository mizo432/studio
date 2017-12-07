package org.venuspj.studio.generic.model.ppt;

import org.junit.Test;
import org.slf4j.Logger;

import static org.venuspj.util.logger.LoggerFactory.*;
import static org.venuspj.util.objects2.Objects2.*;

public class PartyPlaceThingImplTest {
    private static final Logger LOGGER = getLogger();

    @Test
    public void hashCode1() throws Exception {
    }

    @Test
    public void equals1() throws Exception {
    }

    @Test
    @SuppressWarnings("unchecked")
    public void constructor() throws Exception {
        PartyPlaceThing target = new PartyPlaceThingImpl(new PartyPlaceThingIdentifier(1), new PptInfo());
 
        LOGGER.debug("actual:{}", toStringHelper(target).defaultConfig().toString());
    }

}