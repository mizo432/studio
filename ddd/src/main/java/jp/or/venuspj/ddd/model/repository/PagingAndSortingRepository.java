package jp.or.venuspj.ddd.model.repository;

import jp.or.venuspj.ddd.model.entity.Identifier;

public interface PagingAndSortingRepository<T,ID extends Identifier<T>> extends CrudRepository<T,ID > {
    Page<T>	findAll(Pageable pageable);
    Iterable<T>	findAll(Sort sort);
}
