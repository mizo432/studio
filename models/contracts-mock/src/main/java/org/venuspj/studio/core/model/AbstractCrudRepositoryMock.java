package org.venuspj.studio.core.model;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.ddd.model.repository.CrudRepository;
import org.venuspj.ddd.model.repository.EntityNotFoundRuntimeException;

import java.util.Map;

import static org.venuspj.util.collect.Maps2.*;
import static org.venuspj.util.objects2.Objects2.*;

public abstract class AbstractCrudRepositoryMock<E extends Entity<E>> implements CrudRepository<E> {

    protected Map<EntityIdentifier<E>, E> map = newHashMap();

    public AbstractCrudRepositoryMock(Iterable<E> anyIterable) {
        for (E e : anyIterable)
            map.put(e.identifier(), e);

    }

    @Override
    public <I extends EntityIdentifier<E>> E resolve(I anIdentifier) {
        E result = map.get(anIdentifier);
        if (isNull(result))
            throw new EntityNotFoundRuntimeException(anIdentifier);
        return result;
    }

    @Override
    public <S extends E> boolean contains(S anEntity) {
        try {
            resolve(anEntity.identifier());
            return true;
        } catch (EntityNotFoundRuntimeException e) {
            return false;
        }
    }

    @Override
    public <S extends E> void store(S anEntity) {
        map.put(anEntity.identifier(), anEntity);

    }

    @Override
    public <I extends EntityIdentifier<E>> void delete(I anIdentifier) {
        map.remove(anIdentifier);

    }

    @Override
    public <I extends EntityIdentifier<E>> void delete(Iterable<I> anyIdentifiers) {
        for (EntityIdentifier<E> entityIdentifier : anyIdentifiers)
            delete(entityIdentifier);

    }

    @Override
    public <S extends E> void delete(S anEntity) {
        map.remove(anEntity.identifier());

    }
}
