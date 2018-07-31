package io.vertigo.person;

import io.vertigo.db.Db;
import io.vertx.ext.sql.SQLClient;

import java.util.Iterator;

final class DbPersons implements Persons {
  private final Db db;

  DbPersons(Db db) {
    this.db = db;
  }

  @Override
  public final Iterator<Person> iterator() {
    final var sql = db.get();
    sql.queryWithParams("select * from ")
    return null;
  }
}
