package org.venuspj.studio.core.model.role.thingRole.product;

import org.venuspj.ddd.model.repository.RoleCrudRepository;
import org.venuspj.studio.generic.model.ppt.thing.Thing;

public interface ProductRepository extends RoleCrudRepository<Product, Thing> {

    Products resolveEntities(ProductCriteria productCriteria);

}
