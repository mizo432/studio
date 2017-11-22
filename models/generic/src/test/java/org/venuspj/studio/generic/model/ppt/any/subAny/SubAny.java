package org.venuspj.studio.generic.model.ppt.any.subAny;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.model.ppt.any.Any;

public interface SubAny <S extends SubAny<S>> extends Any<S>, Entity<S> {
}
