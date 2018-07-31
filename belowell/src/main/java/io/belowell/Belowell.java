package io.belowell;

import io.belowell.http.server.HttpServer;

import static io.belowell.http.type.Host.localhost;
import static io.belowell.http.type.Port.port;

final class Belowell implements HttpServer {
  {
    listen(
      http(
        localhost(),
        port(8090)
      )
    );
  }
}
