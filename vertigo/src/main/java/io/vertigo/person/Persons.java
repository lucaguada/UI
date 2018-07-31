package io.vertigo.person;

import io.vertigo.db.Db;

import static java.util.Objects.requireNonNull;

public interface Persons extends Iterable<Person> {
  static Persons from(final Db db) {
    return new DbPersons(
      requireNonNull(db, "Db is null")
    );
  }
}
