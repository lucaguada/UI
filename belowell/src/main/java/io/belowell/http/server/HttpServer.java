package io.belowell.http.server;

import io.belowell.http.type.Host;
import io.belowell.http.type.Port;

public interface HttpServer {
  default void http(final Host host, final Port port) {

  }
}
