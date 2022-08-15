package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServerModule_ServerFactoryFactory implements Factory<ServerInterface> {
  private final ServerModule module;

  private final Provider<ServerComponent.Factory> serverComponentProvider;

  public ServerModule_ServerFactoryFactory(ServerModule module,
      Provider<ServerComponent.Factory> serverComponentProvider) {
    this.module = module;
    this.serverComponentProvider = serverComponentProvider;
  }

  @Override
  public ServerInterface get() {
    return serverFactory(module, serverComponentProvider.get());
  }

  public static ServerModule_ServerFactoryFactory create(ServerModule module,
      Provider<ServerComponent.Factory> serverComponentProvider) {
    return new ServerModule_ServerFactoryFactory(module, serverComponentProvider);
  }

  public static ServerInterface serverFactory(ServerModule instance,
      ServerComponent.Factory serverComponent) {
    return Preconditions.checkNotNullFromProvides(instance.serverFactory(serverComponent));
  }
}
