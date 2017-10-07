package org.venuspj.ddd.model.entity;

import org.venuspj.util.uuidProvider.UuidProvider;

import java.util.UUID;

import static org.venuspj.util.objects2.Objects2.*;

/**
 * {@link EntityIdentifier}のデフォルト実装。
 *
 * @param <T> エンティティの型。コンパイル時のみ利用。
 */
public final class DefaultEntityIdentifier<T extends Entity<T>> extends AbstractEntityIdentifier<T> implements EntityIdentifier<T> {

    private UUID uuid;

    /**
     * インスタンスを生成する。
     *
     * @param anEntityClass エンティティクラス。カインドにはFQCNが設定される。
     * @param anUuid        UUID
     * @return {@link DefaultEntityIdentifier}
     */
    public DefaultEntityIdentifier(Class<T> anEntityClass, UUID anUuid) {
        this(anEntityClass.getName(), anUuid);
    }

    /**
     * インスタンスを生成する。
     *
     * @param aKind  カインド
     * @param anUuid {@link UUID}
     */
    public DefaultEntityIdentifier(String aKind, UUID anUuid) {
        super(aKind);
        uuid = anUuid;
    }

    public static <E extends Entity<E>> EntityIdentifier<E> newId(Class<E> clazz) {
        return new DefaultEntityIdentifier<E>(clazz, UuidProvider.randomUUID());
    }

    public static <E extends Entity<E>> EntityIdentifier<E> emptyIdentifier(Class<E> clazz) {
        return new DefaultEntityIdentifier<E>(clazz, null);
    }

    public static <E extends Entity<E>> EntityIdentifier<E> byUuid(Class<E> clazz, UUID anUuid) {
        return new DefaultEntityIdentifier<E>(clazz, anUuid);
    }

    public String getKind() {
        return kind;
    }

    public UUID toUUID() {
        return uuid;
    }

    @Override
    public int hashCode() {
        return hash(kind, uuid);
    }

    @Override
    public boolean equals(Object o) {
        if (isNull(o)) return false;
        if (this == o) return true;
        return o instanceof DefaultEntityIdentifier &&
                equal((((DefaultEntityIdentifier) o).kind), kind) &&
                equal((((DefaultEntityIdentifier) o).uuid), uuid);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("kind", kind)
                .add("uuid", uuid)
                .omitNullValues()
                .toString();
    }
}
