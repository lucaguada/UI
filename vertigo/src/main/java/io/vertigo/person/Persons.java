package io.vertigo.person;

import io.vertigo.data.DbClient;

import static java.util.Objects.requireNonNull;

public interface Persons extends Iterable<Person> {
  static Persons from(final DbClient db) {
    return new DbPersons(
      requireNonNull(db, "Db is null")
    );
  }
}
