package org.venuspj.ddd.model.repository;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;

import java.util.Comparator;
import java.util.List;

/**
 * テストで使用するためのリポジトリ
 */
public class OnMemoryPagingAndSortingRepository<T extends Entity<T>> implements PagingAndSortingRepository<T>, Cloneable {

    private CrudRepository<T> crudRepository = new OnMemoryCrudRepository<>();

    public OnMemoryPagingAndSortingRepository() {
    }

    public OnMemoryPagingAndSortingRepository(CrudRepository<T> anyCrudRepository) {
        crudRepository = anyCrudRepository;

    }

    @Override
    @SuppressWarnings("unchecked")
    public OnMemoryPagingAndSortingRepository<T> clone() {
        try {
            return (OnMemoryPagingAndSortingRepository<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error("clone not supported");
        }
    }

    @Override
    public T resolve(EntityIdentifier<T> anIdentifier) {
        return crudRepository.resolve(anIdentifier);
    }

    @Override
    public Iterable<T> resolve(Iterable<EntityIdentifier<T>> entityIdentifiers) {
        return null;
    }

    @Override
    public List<T> asEntitiesList() {
        return crudRepository.asEntitiesList();
    }

    @Override
    public boolean contains(EntityIdentifier<T> identifier) {
        return crudRepository.contains(identifier);
    }


    @Override
    public <S extends T> boolean contains(S entity) {
        return crudRepository.contains(entity);
    }

    @Override
    public <S extends T> void store(S entity) {
        crudRepository.store(entity);
    }

    @Override
    public void delete(EntityIdentifier<T> identifier) {
        crudRepository.delete(identifier);
    }

    @Override
    public void delete(Iterable<EntityIdentifier<T>> entityIdentifiers) {
        crudRepository.delete(entityIdentifiers);

    }

    @Override
    public <S extends T> void delete(S entity) {
        crudRepository.delete(entity);

    }


    @Override
    public <S extends T> Page<T> findAll(Pageable<T> pageable) {
        return null;
    }

    @Override
    public <S extends T> Iterable<T> findAll(Comparator<S> sort) {
        return null;
    }

    @Override
    public <S extends T> Page<T> findAll(Pageable<T> pageable, Comparator<S> sortCondition) {
        return null;
    }
}
