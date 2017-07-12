package org.venuspj.ddd.model.repository;

import com.google.common.collect.Lists;
import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.util.map2.Maps2;

import java.util.ArrayList;
import java.util.Map;

/**
 */
public class MemoryCrudRepository<E extends Entity<E>, ID extends EntityIdentifier<E>> implements CrudRepository<E, ID> {

    Map<EntityIdentifier<E>, E> map = Maps2.newHashMap();

    public MemoryCrudRepository(Iterable<E> aList) {
        for (E entity : aList) {
            map.put(entity.identifier(), entity);
        }
    }

    @Override
    public Iterable<E> findAll() {
        ArrayList<E> result = Lists.newArrayList(map.values());
        return result;
    }

    @Override
    public E findOne(ID id) {
        return map.get(id);
    }

    @Override
    public E save(E entity) {
        return map.put(entity.identifier(), entity);
    }

    @Override
    public E drop(ID id) {
        return map.remove(id);
    }
}
