package io.vertigo.res;

import java.util.Enumeration;
import java.util.Optional;
import java.util.ResourceBundle;

final class BundleImpl extends Bundle {
  private final ResourceBundle bundle;

  BundleImpl(ResourceBundle bundle) {
    this.bundle = bundle;
  }

  @Override
  public final Optional<String> property(String name) {
    return Optional.ofNullable(name)
      .filter(bundle::containsKey)
      .map(bundle::getString);
  }

  @Override
  protected final Object handleGetObject(String key) {
    return bundle.getObject(key);
  }

  @Override
  public final Enumeration<String> getKeys() {
    return bundle.getKeys();
  }
}
