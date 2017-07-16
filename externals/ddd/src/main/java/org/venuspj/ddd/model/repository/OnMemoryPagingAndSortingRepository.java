package org.venuspj.ddd.model.repository;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.util.collect.Collections3;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

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
    public List<T> asEntitiesList() {
        return crudRepository.asEntitiesList();
    }

    @Override
    public Set<T> asEntitiesSet() {
        return crudRepository.asEntitiesSet();
    }

    @Override
    public boolean contains(EntityIdentifier<T> identifier) {
        return crudRepository.contains(identifier);
    }

    @Override
    public boolean contains(T entity) {
        return crudRepository.contains(entity);
    }

    @Override
    public void store(T entity) {
        crudRepository.store(entity);
    }

    @Override
    public void delete(EntityIdentifier<T> identifier) {
        crudRepository.delete(identifier);
    }

    @Override
    public void delete(T entity) {
        crudRepository.delete(entity);
    }

    @Override
    public List<T> findByIdentifires(Iterable<EntityIdentifier<T>> entityIdentifiers) {
        return crudRepository.findByIdentifires(entityIdentifiers);
    }

    @Override
    public Page<T> findAll(Pageable<T> pageable) {
        PageBreaker<T> PageBreaker = pageable.pageBreaker();
        List<T> list = asEntitiesList();
        return new Page<T>() {
        };
    }

    @Override
    public Iterable<T> findAll(Comparator<T> sortCondition) {
        List<T> resultList = Collections3.sort(asEntitiesList(), sortCondition);
        return null;
    }

    @Override
    public Page<T> findAll(Pageable<T> pageable, Comparator<T> sortCondition) {
        return null;
    }

}
