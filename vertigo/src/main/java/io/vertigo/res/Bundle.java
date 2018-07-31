package io.vertigo.res;

import java.util.Optional;
import java.util.ResourceBundle;

import static java.util.Objects.requireNonNull;

public abstract class Bundle extends ResourceBundle {
  static Bundle of(final String resource) {
    return new BundleImpl(
      ResourceBundle.getBundle(requireNonNull(resource, "Resource is null"))
    );
  }
  static Bundle bundleOf(final String resource) {
    return of(resource);
  }

  public abstract Optional<String> property(final String name);
  public final String propertyOrDefault(final String name, final String otherwise) {
    return property(name).orElse(otherwise);
  }
}
