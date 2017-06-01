package jp.or.venuspj.util.builder;

import com.google.common.collect.Maps;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.Map;

public class MapBuilder<K, V> extends ObjectBuilder<Map<K, V>, MapBuilder<K, V>> {

    Map<K, V> map = Maps.newHashMap();

    public MapBuilder<K, V> put(K key, V value) {
        if (Objects2.isNull(key)) return getThis();
        addConfigurator(builder -> builder.map.put(key, value));
        return getThis();
    }

    public MapBuilder<K, V> putAll(Map<K, V> aMap) {
        if (Objects2.isNull(aMap)) return getThis();
        addConfigurator(builder -> builder.map.putAll(aMap));
        return getThis();
    }

    @Override
    protected void apply(Map<K, V> vo, MapBuilder<K, V> builder) {
        builder.putAll(vo);

    }

    @Override
    protected Map<K, V> createValueObject() {
        return Maps.newHashMap(map);
    }

    @Override
    protected MapBuilder<K, V> getThis() {
        return this;
    }

    @Override
    protected MapBuilder<K, V> newInstance() {
        return new MapBuilder<>();
    }
}
