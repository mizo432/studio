package org.venuspj.studio.core.usecase.product;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.generic.model.ppt.thing.ThingIdentifier;

public interface ProductQueryInputPort extends Request {

    ThingIdentifier getProductIdentifier();

}
