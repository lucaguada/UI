package io.belowell.http.type;

import java.util.function.Predicate;

enum HostConstraints implements Predicate<String> {
  ByLocalhost() {
    @Override
    public final boolean test(String s) {
      return "localhost".equals(s);
    }
  },

  ByLocalIP() {
    @Override
    public final boolean test(String s) {
      return "127.0.0.1".equals(s);
    }
  },
}
