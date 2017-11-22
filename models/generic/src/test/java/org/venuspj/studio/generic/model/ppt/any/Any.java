package org.venuspj.studio.generic.model.ppt.any;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.model.ppt.PartyPlaceThing;

public interface Any<A extends Any<A>> extends Entity<A>, PartyPlaceThing<A> {

}
