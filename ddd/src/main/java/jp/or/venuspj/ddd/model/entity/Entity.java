package jp.or.venuspj.ddd.model.entity;

public interface Entity<E extends Entity<E>> {
    public boolean sameIdentifierAs(E other);
}
