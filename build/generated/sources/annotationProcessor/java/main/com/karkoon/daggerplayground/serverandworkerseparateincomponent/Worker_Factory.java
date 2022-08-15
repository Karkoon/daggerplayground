package com.karkoon.daggerplayground.serverandworkerseparateincomponent;

import dagger.internal.DaggerGenerated;
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
public final class Worker_Factory {
  private final Provider<Context> contextProvider;

  public Worker_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  public Worker get(Server server) {
    return newInstance(contextProvider.get(), server);
  }

  public static Worker_Factory create(Provider<Context> contextProvider) {
    return new Worker_Factory(contextProvider);
  }

  public static Worker newInstance(Object context, Object server) {
    return new Worker((Context) context, (Server) server);
  }
}
