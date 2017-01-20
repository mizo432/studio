package jp.or.venuspj.studo.general.model.relationship.party.person;

import jp.or.venuspj.ddd.model.entity.Entity;
import jp.or.venuspj.ddd.model.value.DecidableSameIdentifierAs;

public interface Person extends Entity<Person>, DecidableSameIdentifierAs<Person> {
}
