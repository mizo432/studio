package jp.or.venuspj.ddd.model.entity;

import jp.or.venuspj.ddd.model.value.Value;

import java.util.UUID;

public interface EntityIdentifier<E> extends Value {

    /**
     * この識別子のカインドを取得する。
     * <p>通常はエンティティのFQCNが格納されている</p>
     *
     * @return カインド
     */
    String getKind();

    /**
     * この識別子を{@link UUID}に変換する。
     *
     * @return {@link UUID}
     */
    UUID toUUID();

}
