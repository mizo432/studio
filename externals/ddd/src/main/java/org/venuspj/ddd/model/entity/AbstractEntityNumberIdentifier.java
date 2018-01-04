package org.venuspj.ddd.model.entity;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

/**
 * {@link EntityIdentifier}の数値キー、基底実装。
 *
 * @param <T> エンティティの型。コンパイル時のみ利用。
 */
public abstract class AbstractEntityNumberIdentifier<T extends Entity<T>> extends AbstractEntityIdentifier<T> implements EntityIdentifier<T> {

    protected Integer value;

    public void setValue(Integer aValue) {
        value = aValue;
    }

    public Integer getValue() {
        return value;
    }

    /**
     * インスタンスを生成する。
     *
     * @param anEntityClass エンティティクラス。カインドにはFQCNが設定される。
     * @return {@link AbstractEntityNumberIdentifier}
     */
    protected AbstractEntityNumberIdentifier(Class<?> anEntityClass) {
        this(anEntityClass, -1);
    }

    /**
     * インスタンスを生成する。
     *
     * @param anEntityClass エンティティクラス。カインドにはFQCNが設定される。
     * @return {@link AbstractEntityNumberIdentifier}
     */
    protected AbstractEntityNumberIdentifier(Class<?> anEntityClass, Integer aValue) {
        this(anEntityClass.getCanonicalName(), aValue);
    }

    /**
     * インスタンスを生成する。
     *
     * @param aKind カインド
     */
    protected AbstractEntityNumberIdentifier(String aKind) {
        this(aKind, -1);
    }

    /**
     * インスタンスを生成する。
     *
     * @param aKind  カインド
     * @param aValue 値
     */
    protected AbstractEntityNumberIdentifier(String aKind, Integer aValue) {
        super(aKind);
        value = aValue;
    }

    protected AbstractEntityNumberIdentifier() {
        this(AbstractEntityNumberIdentifier.class, -1);

    }

    @Override
    public boolean equals(Object o) {
        return o instanceof AbstractEntityNumberIdentifier &&
                equal(((AbstractEntityNumberIdentifier) o).kind, kind) &&
                equal(((AbstractEntityNumberIdentifier) o).value, value);
    }

    @Override
    public int hashCode() {
        return hash(kind, value);
    }

    @Override
    public boolean isEmpty() {
        return equal(value, Integer.valueOf(-1));
    }
}
