package io.belowell.http.type;

import java.util.function.Predicate;

enum PortConstraints implements Predicate<Integer> {
  By8000And90000 {
    @Override
    public final boolean test(final Integer value) {
      return value >= 8000 && value <= 90000;
    }
  }
}
