package jp.or.venuspj.ddd.model.value;

/**
 * Created by mizoguchi on 2017/01/28.
 */
public interface ValueObject {

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
