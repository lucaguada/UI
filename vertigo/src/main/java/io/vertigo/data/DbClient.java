package io.vertigo.data;

import io.vertx.core.Vertx;
import io.vertx.ext.sql.SQLClient;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

public interface DbClient extends Supplier<SQLClient> {
  static DbClient of(final DbSource source, final Vertx vertx) {
    return new DbClientImpl(
      requireNonNull(source, "Source is null"),
      requireNonNull(vertx, "Vertx is null")
    );
  }
}
