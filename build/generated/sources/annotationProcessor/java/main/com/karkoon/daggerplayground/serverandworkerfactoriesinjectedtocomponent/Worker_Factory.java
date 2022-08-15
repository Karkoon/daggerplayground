package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class Worker_Factory implements Factory<Worker> {
  private final Provider<Context> contextProvider;

  private final Provider<ServerInterface> serverProvider;

  public Worker_Factory(Provider<Context> contextProvider,
      Provider<ServerInterface> serverProvider) {
    this.contextProvider = contextProvider;
    this.serverProvider = serverProvider;
  }

  @Override
  public Worker get() {
    return newInstance(contextProvider.get(), serverProvider.get());
  }

  public static Worker_Factory create(Provider<Context> contextProvider,
      Provider<ServerInterface> serverProvider) {
    return new Worker_Factory(contextProvider, serverProvider);
  }

  public static Worker newInstance(Context context, ServerInterface server) {
    return new Worker(context, server);
  }
}
