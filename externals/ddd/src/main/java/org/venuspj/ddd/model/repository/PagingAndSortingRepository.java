package org.venuspj.ddd.model.repository;

import org.venuspj.ddd.model.entity.Entity;

import java.util.Comparator;

public interface PagingAndSortingRepository<T extends Entity<T>> extends CrudRepository<T> {

    <S extends T> Page<T> findAll(Pageable<T> pageable);

    <S extends T> Iterable<T> findAll(Comparator<S> sort);

    <S extends T> Page<T> findAll(Pageable<T> pageable, Comparator<S> sortCondition);

}
