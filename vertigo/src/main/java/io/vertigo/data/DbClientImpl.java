package io.vertigo.data;

import io.vertx.core.Vertx;
import io.vertx.ext.jdbc.JDBCClient;
import io.vertx.ext.sql.SQLClient;

final class DbClientImpl implements DbClient {
  private final DbSource source;
  private final Vertx vertx;

  DbClientImpl(DbSource source, Vertx vertx) {
    this.source = source;
    this.vertx = vertx;
  }

  @Override
  public SQLClient get() {
    return JDBCClient.create(vertx, source.get());
  }
}
