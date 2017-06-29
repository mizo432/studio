package org.venuspj.ddd.model.value;

public interface Value {

    /**
     * 全てのプロパティの等価性を用いて、このバリューオブジェクトの等価性を比較する。
     *
     * @param that 比較対象オブジェクト
     * @return 等価の場合は{@code true}
     */
    boolean equals(Object that);

    /**
     * このエンティティのハッシュコードを返す。
     *
     * @return ハッシュコード
     */
    int hashCode();
}
