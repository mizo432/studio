package org.venuspj.ddd.model.repository;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;

import java.util.List;

public interface CrudRepository<E extends Entity<E>> {
    /**
     * 識別子に該当するエンティティをリポジトリから取得する。
     *
     * @param identifier 識別子
     * @return エンティティ
     * @throws IllegalArgumentException
     * @throws EntityNotFoundRuntimeException エンティティが見つからなかった場合
     * @throws RepositoryRuntimeException     リポジトリにアクセスできない場合
     */
    E resolve(EntityIdentifier<E> identifier);

    /**
     * 識別子に該当するエンティティをリポジトリから取得する。
     *
     * @param identifiers 識別子
     * @return エンティティ
     * @throws IllegalArgumentException
     * @throws EntityNotFoundRuntimeException エンティティが見つからなかった場合
     * @throws RepositoryRuntimeException     リポジトリにアクセスできない場合
     */
    Iterable<E> resolve(Iterable<EntityIdentifier<E>> identifiers);

    /**
     * このリポジトリに格納されているすべてのエンティティをListで取得する。
     *
     * @return すべてのエンティティのList
     * @throws RepositoryRuntimeException リポジトリにアクセスできない場合
     */
    List<E> asEntitiesList();

    /**
     * 指定した識別子のエンティティが存在するかを返す。
     *
     * @param identifier 識別子
     * @return 存在する場合はtrue
     * @throws RepositoryRuntimeException リポジトリにアクセスできない場合
     */
    boolean contains(EntityIdentifier<E> identifier);

    /**
     * 指定したのエンティティが存在するかを返す。
     *
     * @param entity エンティティ
     * @return 存在する場合はtrue
     * @throws RepositoryRuntimeException リポジトリにアクセスできない場合
     */
    <S extends E> boolean contains(S entity);

    /**
     * エンティティを保存する。
     *
     * @param entity 保存する対象のエンティティ
     * @throws RepositoryRuntimeException リポジトリにアクセスできない場合
     */
    <S extends E> void store(S entity);

    /**
     * 指定した識別子のエンティティを削除する。
     *
     * @param identifier 識別子
     * @throws EntityNotFoundRuntimeException 指定された識別子を持つエンティティが見つからなかった場合
     * @throws RepositoryRuntimeException     リポジトリにアクセスできない場合
     */
    void delete(EntityIdentifier<E> identifier);

    /**
     * 指定した識別子のエンティティを削除する。
     *
     * @param identifiers 識別子
     * @throws EntityNotFoundRuntimeException 指定された識別子を持つエンティティが見つからなかった場合
     * @throws RepositoryRuntimeException     リポジトリにアクセスできない場合
     */
    void delete(Iterable<EntityIdentifier<E>> identifiers);


    /**
     * 指定したエンティティを削除する。
     *
     * @param entity エンティティ
     * @throws EntityNotFoundRuntimeException 指定された識別子を持つエンティティが見つからなかった場合
     * @throws RepositoryRuntimeException     リポジトリにアクセスできない場合
     */
    <S extends E> void delete(S entity);

}
