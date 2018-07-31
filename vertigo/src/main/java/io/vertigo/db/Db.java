package io.vertigo.db;

import io.vertx.core.Vertx;
import io.vertx.ext.sql.SQLClient;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

public interface Db extends Supplier<SQLClient> {
  static Db databaseOf(final DbSource source, final Vertx vertx) {
    return new DbImpl(
      requireNonNull(source, "Source is null"),
      requireNonNull(vertx, "Vertx is null")
    );
  }
}
