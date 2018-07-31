package io.belowell;

import io.undertow.Undertow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.undertow.util.Headers.CONTENT_TYPE;

public interface Main {
  Logger log = LoggerFactory.getLogger(Main.class);

  static void main(String... args) {
    final var port = 8090;
    final var server = Undertow.builder()
      .addHttpListener(port, "localhost")
      .setHandler(it -> {
        it.getResponseHeaders().put(CONTENT_TYPE, "text/plain");
        it.getResponseSender().send("Hello World");
      }).build();
    server.start();

    log.info("Undertow has been started on port: {}", port);
  }
}
