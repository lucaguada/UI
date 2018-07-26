package io.vertigo.person;

import io.vertigo.data.DbClient;

import java.util.Iterator;

final class DbPersons implements Persons {
  private final DbClient client;

  DbPersons(DbClient client) {
    this.client = client;
  }

  @Override
  public final Iterator<Person> iterator() {
    final var client = this.client.get();
    return null;
  }
}
