package org.venuspj.ddd.model.repository;

import org.venuspj.ddd.model.entity.EntityIdentifier;

public interface CrudRepository<E,ID extends EntityIdentifier<E>> extends Repository<E,ID> {
}