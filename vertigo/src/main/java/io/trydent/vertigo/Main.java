package io.trydent.vertigo;

import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.handler.CorsHandler;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;

import static io.vertx.core.Vertx.vertx;
import static io.vertx.ext.web.Router.router;
import static java.lang.String.format;

public interface Main {
  final class User {
    final String firstName;
    final String lastName;

    final LocalDate birth;
    final String fiscalCode;

    User(String firstName, String lastName, LocalDate birth, String fiscalCode) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.birth = birth;
      this.fiscalCode = fiscalCode;
    }

    @Override
    public String toString() {
      return format("{firstName:'%s', lastName:'%s', birth:'%s', fiscalCode:'%s'}", firstName, lastName, birth, fiscalCode);
    }
  }

  static void main(String... args) {
    final var vertx = vertx();

    final var router = router(vertx);

    final User[] users = {
      new User(
        "Ryu",
        "",
        LocalDate.of(1969, 4, 24),
        "RYU"
      ),
      new User(
        "Ken",
        "Masters",
        LocalDate.of(1968, 5, 25),
        "KENMSR"
      ),
      new User(
        "Chun-Li",
        "Chung",
        LocalDate.of(1968, 5, 25),
        "CNLCNG"
      )
    };

    router.route().handler(
      CorsHandler.create("*")
        .allowedHeaders(
          Set.of(
            "Access-Control-Request-Method",
            "Access-Control-Allow-Credentials",
            "Access-Control-Allow-Origin",
            "Access-Control-Allow-Headers",
            "Content-Type"
          )
        )
        .allowedMethods(
          Set.of(
            HttpMethod.GET,
            HttpMethod.POST,
            HttpMethod.PUT,
            HttpMethod.PATCH,
            HttpMethod.DELETE,
            HttpMethod.OPTIONS,
            HttpMethod.HEAD
          )
        )
    );

    router.get("/api/users").handler(it ->
      it.response()
        .putHeader("Content-Type", "application/json")
        .end(Arrays.toString(users))
    );

    vertx
      .createHttpServer()
      .requestHandler(router::accept)
      .listen(8090);
  }
}
