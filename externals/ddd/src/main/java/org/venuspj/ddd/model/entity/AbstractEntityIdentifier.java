package org.venuspj.ddd.model.entity;

import org.venuspj.util.objects2.Objects2;

/**
 * {@link EntityIdentifier}のデフォルト実装。
 *
 * @param <T> エンティティの型。コンパイル時のみ利用。
 */
public abstract class AbstractEntityIdentifier<T extends Entity<T>> implements EntityIdentifier<T> {

    protected String kind;

    /**
     * インスタンスを生成する。
     *
     * @param anEntityClass エンティティクラス。カインドにはFQCNが設定される。
     * @return {@link AbstractEntityIdentifier}
     */
    protected AbstractEntityIdentifier(Class<T> anEntityClass) {
        this(anEntityClass.getCanonicalName());
    }

    /**
     * インスタンスを生成する。
     *
     * @param aKind カインド
     */
    private AbstractEntityIdentifier(String aKind) {
        kind = aKind;
    }

    protected AbstractEntityIdentifier() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o instanceof AbstractEntityIdentifier == false) {
            return false;
        }
        AbstractEntityIdentifier that = (AbstractEntityIdentifier) o;
        if (!Objects2.equal(kind, that.kind)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects2.hash(kind);
    }
}
