package io.vertigo.db;

import io.vertx.core.Vertx;

import javax.sql.DataSource;
import java.sql.Driver;
import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

public interface DbSource extends Supplier<DataSource> {
  static <D extends Driver> DbSource of(final String username, final String password, final String url, final Class<D> driver) {
    return new DbSourceImpl<>(
      requireNonNull(username, "Username is null"),
      requireNonNull(password, "Password is null"),
      requireNonNull(url, "Url is null"),
      requireNonNull(driver, "Driver is null")
    );
  }

  default Db clientOf(final Vertx vertx) {
    return Db.databaseOf(this, vertx);
  }
}
