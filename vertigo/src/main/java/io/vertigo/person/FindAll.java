package io.vertigo.person;

import java.util.ResourceBundle;
import java.util.function.Supplier;

final class FindAll implements Supplier<String> {
  private final ResourceBundle bundle;

  FindAll(final ResourceBundle bundle) {
    this.bundle = bundle;
  }

  @Override
  public final String get() {
    return bundle.containsKey();
  }
}
