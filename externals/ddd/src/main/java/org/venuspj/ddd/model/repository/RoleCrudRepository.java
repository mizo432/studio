package org.venuspj.ddd.model.repository;

import org.venuspj.ddd.model.elementType.Role;
import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;


/**
 * @param <R>
 * @param <E>
 */
public interface RoleCrudRepository<R extends Role, E extends Entity<E>> {
    /**
     * 識別子に該当するエンティティをリポジトリから取得する。
     *
     * @param anIdentifier 識別子
     * @return エンティティ
     * @throws IllegalArgumentException
     * @throws EntityNotFoundRuntimeException エンティティが見つからなかった場合
     * @throws RepositoryRuntimeException     リポジトリにアクセスできない場合
     */
    R resolve(EntityIdentifier<E> anIdentifier);

    /**
     * 識別子に該当するエンティティをリポジトリから取得する。
     *
     * @param anyIdentifiers 識別子
     * @return エンティティ
     * @throws IllegalArgumentException
     * @throws EntityNotFoundRuntimeException エンティティが見つからなかった場合
     * @throws RepositoryRuntimeException     リポジトリにアクセスできない場合
     */
    Iterable<R> resolve(Iterable<EntityIdentifier<E>> anyIdentifiers);

    /**
     * このリポジトリに格納されているすべてのエンティティをListで取得する。
     *
     * @return すべてのエンティティのList
     * @throws RepositoryRuntimeException リポジトリにアクセスできない場合
     */
    Iterable<R> asEntitiesList();

    /**
     * 指定した識別子のエンティティが存在するかを返す。
     *
     * @param anIdentifier 識別子
     * @return 存在する場合はtrue
     * @throws RepositoryRuntimeException リポジトリにアクセスできない場合
     */
    boolean contains(EntityIdentifier<E> anIdentifier);

    /**
     * 指定したのエンティティが存在するかを返す。
     *
     * @param anEntity エンティティ
     * @return 存在する場合はtrue
     * @throws RepositoryRuntimeException リポジトリにアクセスできない場合
     */
    <S extends R> boolean contains(S anEntity);

    /**
     * エンティティを保存する。
     *
     * @param entity 保存する対象のエンティティ
     * @throws RepositoryRuntimeException リポジトリにアクセスできない場合
     */
    <S extends R> void store(S entity);

    /**
     * 指定した識別子のエンティティを削除する。
     *
     * @param anIdentifier 識別子
     * @throws EntityNotFoundRuntimeException 指定された識別子を持つエンティティが見つからなかった場合
     * @throws RepositoryRuntimeException     リポジトリにアクセスできない場合
     */
    void delete(EntityIdentifier<E> anIdentifier);

    /**
     * 指定した識別子のエンティティを削除する。
     *
     * @param anyIdentifiers 識別子
     * @throws EntityNotFoundRuntimeException 指定された識別子を持つエンティティが見つからなかった場合
     * @throws RepositoryRuntimeException     リポジトリにアクセスできない場合
     */
    void delete(Iterable<EntityIdentifier<E>> anyIdentifiers);


    /**
     * 指定したエンティティを削除する。
     *
     * @param anEntity エンティティ
     * @throws EntityNotFoundRuntimeException 指定された識別子を持つエンティティが見つからなかった場合
     * @throws RepositoryRuntimeException     リポジトリにアクセスできない場合
     */
    <S extends R> void delete(S anEntity);

}
