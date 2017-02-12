package jp.or.venuspj.ddd.model.entity;

import jp.or.venuspj.util.objects2.Objects2;

import java.util.UUID;

/**
 * {@link EntityIdentifier}のデフォルト実装。
 *
 * @param <T> エンティティの型。コンパイル時のみ利用。
 */
public abstract class AbstractEntityIdentifier<T extends Entity<T>> implements EntityIdentifier<T> {

    protected String kind;
    protected Identifier<T> identifier;

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
     * @param anEntityClass エンティティクラス。カインドにはFQCNが設定される。
     * @param anIdentifier        anIdentifier
     * @return {@link AbstractEntityIdentifier}
     */
    public AbstractEntityIdentifier(Class<T> anEntityClass, Identifier<T> anIdentifier) {
        this(anEntityClass.getCanonicalName(), anIdentifier);
    }

    /**
     * インスタンスを生成する。
     *
     * @param aKind カインド
     */
    private AbstractEntityIdentifier(String aKind) {
        kind = aKind;
    }

    /**
     * インスタンスを生成する。
     *
     * @param aKind  カインド
     * @param anIdentifier {@link UUID}
     */
    private AbstractEntityIdentifier(String aKind, Identifier<T> anIdentifier) {
        kind = aKind;
        identifier = anIdentifier;
    }

    protected AbstractEntityIdentifier() {

    }

    @Override
    public int hashCode() {
        return Objects2.hash(kind, identifier);
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
        if (!Objects2.equal(identifier, that.identifier)) return false;
        return true;
    }

}
