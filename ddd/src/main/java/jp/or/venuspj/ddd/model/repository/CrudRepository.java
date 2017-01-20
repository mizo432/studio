package jp.or.venuspj.ddd.model.repository;

import jp.or.venuspj.ddd.model.entity.Identifier;

public interface CrudRepository<E,ID extends Identifier<E>> extends Repository<E,ID> {
}
