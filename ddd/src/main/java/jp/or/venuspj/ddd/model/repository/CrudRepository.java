package jp.or.venuspj.ddd.model.repository;

import jp.or.venuspj.ddd.model.entity.EntityIdentifier;

public interface CrudRepository<E,ID extends EntityIdentifier<E>> extends Repository<E,ID> {
}
