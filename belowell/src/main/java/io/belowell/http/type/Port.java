package io.belowell.http.type;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.IntSupplier;

import static io.belowell.http.type.PortConstraints.By8000And90000;

public final class Port implements IntSupplier {
  private final int value;

  private Port(final int value) {
    this.value = value;
  }

  @Override
  public final int getAsInt() {
    return this.value;
  }

  public static Optional<Port> parsePort(final int value) {
    return Optional.of(value)
      .filter(By8000And90000)
      .map(Port::new);
  }

  public static Port port(final int value) {
    return parsePort(value).orElseThrow(IllegalArgumentException::new);
  }
}
