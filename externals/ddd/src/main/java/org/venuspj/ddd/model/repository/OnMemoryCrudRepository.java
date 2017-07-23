package org.venuspj.ddd.model.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.util.collect.Lists2;
import org.venuspj.util.collect.Maps2;
import org.venuspj.util.collect.Sets2;
import org.venuspj.util.objects2.Objects2;
import org.venuspj.util.validate.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * テストで使用するためのリポジトリ
 */
public class OnMemoryCrudRepository<T extends Entity<T>> implements CrudRepository<T>, Cloneable {
    private static final Logger LOGGER = LoggerFactory.getLogger(OnMemoryCrudRepository.class);

    private final Map<EntityIdentifier<T>, T> entities = Maps2.newHashMap();

    public OnMemoryCrudRepository() {
    }

    public OnMemoryCrudRepository(List<T> anyEntities) {
        for (T entity : anyEntities)
            store(entity);

    }

    @Override
    @SuppressWarnings("unchecked")
    public OnMemoryCrudRepository<T> clone() {
        try {
            return (OnMemoryCrudRepository<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error("clone not supported");
        }
    }

    @Override
    public T resolve(EntityIdentifier<T> identifier) {
        Validate.notNull(identifier);
        T entity = entities.get(identifier);
        if (Objects2.isNull(entity)) {
            EntityNotFoundRuntimeException entityNotFoundRuntimeException = new EntityNotFoundRuntimeException(identifier);
            LOGGER.warn(String.format("entity not Found %s", identifier), entityNotFoundRuntimeException);
            throw entityNotFoundRuntimeException;
        }
        return entities.get(identifier).clone();
    }

    @Override
    public List<T> asEntitiesList() {
        List<T> result = new ArrayList<T>(entities.size());
        for (T entity : entities.values()) {
            result.add(entity.clone());
        }
        return result;
    }

    @Override
    public Set<T> asEntitiesSet() {
        Set<T> result = Sets2.newHashSetWithExpectedSize(entities.size());
        for (T entity : entities.values()) {
            result.add(entity.clone());
        }
        return result;
    }

    @Override
    public boolean contains(EntityIdentifier<T> identifier) {
        Validate.notNull(identifier);
        return entities.containsKey(identifier);
    }

    @Override
    public boolean contains(T entity) {
        Validate.notNull(entity);
        return contains(entity.identifier());
    }

    @Override
    public void store(T entity) {
        Validate.notNull(entity);
        entities.put(entity.identifier(), entity.clone());
    }

    @Override
    public void delete(EntityIdentifier<T> identifier) {
        Validate.notNull(identifier);
        entities.remove(identifier);
    }

    @Override
    public void delete(T entity) {
        Validate.notNull(entity);
        delete(entity.identifier());
    }

    @Override
    public List<T> findByIdentifires(Iterable<EntityIdentifier<T>> entityIdentifiers) {
        List<T> result = Lists2.newArrayList();
        for (EntityIdentifier<T> entityIdentifier : entityIdentifiers) {
            try {
                result.add(resolve(entityIdentifier));
            } catch (EntityNotFoundRuntimeException ignore) {
            }

        }
        return result;
    }
}