package io.vertigo.data;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

final class DbSourceImpl<D extends java.sql.Driver> implements DbSource {
  private final String username;
  private final String password;
  private final String url;
  private final Class<D> driver;

  DbSourceImpl(String username, String password, String url, Class<D> driver) {
    this.username = username;
    this.password = password;
    this.url = url;
    this.driver = driver;
  }

  @Override
  public final DataSource get() {
    final var config = new HikariConfig();
    config.setUsername(username);
    config.setPassword(password);
    config.setJdbcUrl(url);
    config.setDriverClassName(driver.getName());
    return new HikariDataSource(config);
  }
}
