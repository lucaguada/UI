package io.vertigo.db;

import io.vertx.core.Vertx;
import io.vertx.ext.jdbc.JDBCClient;
import io.vertx.ext.sql.SQLClient;

final class DbImpl implements Db {
  private final DbSource source;
  private final Vertx vertx;

  DbImpl(DbSource source, Vertx vertx) {
    this.source = source;
    this.vertx = vertx;
  }

  @Override
  public SQLClient get() {
    return JDBCClient.create(vertx, source.get());
  }
}
