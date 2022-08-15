package com.karkoon.daggerplayground.serverandworkerseparate;

import dagger.internal.DaggerGenerated;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
final class DaggerServerComponent implements ServerComponent {
  private final DaggerServerComponent serverComponent = this;

  private Server_Factory serverProvider;

  private Provider<Server.Factory> factoryProvider;

  private DaggerServerComponent() {

    initialize();

  }

  public static Builder builder() {
    return new Builder();
  }

  public static ServerComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.serverProvider = Server_Factory.create();
    this.factoryProvider = Server_Factory_Impl.create(serverProvider);
  }

  @Override
  public Server.Factory provideServerFactory() {
    return factoryProvider.get();
  }

  static final class Builder {
    private Builder() {
    }

    public ServerComponent build() {
      return new DaggerServerComponent();
    }
  }
}
