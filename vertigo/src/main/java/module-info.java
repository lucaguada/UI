module io.vertigo {
  requires vertx.core;
  requires vertx.web;
  requires vertx.jdbc.client;
  requires vertx.sql.common;

  requires h2;
  requires com.zaxxer.hikari;
  requires org.slf4j;

  requires java.sql;
}
