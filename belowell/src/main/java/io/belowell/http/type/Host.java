package io.belowell.http.type;

import java.util.Optional;
import java.util.function.Supplier;

import static io.belowell.http.type.HostConstraints.ByLocalIP;
import static io.belowell.http.type.HostConstraints.ByLocalhost;

public final class Host implements Supplier<String> {
  private final String value;

  private Host(final String value) {
    this.value = value;
  }

  @Override
  public final String get() {
    return this.value;
  }

  public static Optional<Host> parseHost(final String value) {
    return Optional.ofNullable(value)
      .filter(ByLocalhost.or(ByLocalIP))
      .map(Host::new);
  }

  public static Host host(final String value) {
    return parseHost(value).orElseThrow(IllegalArgumentException::new);
  }

  public static Host localhost() {
    return host("localhost");
  }
  public static Host localIP() {
    return host("127.0.0.1");
  }
}
