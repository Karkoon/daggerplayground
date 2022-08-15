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
public final class Server_Factory {
  private final Provider<Context> contextProvider;

  public Server_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  public Server get(String address) {
    return newInstance(contextProvider.get(), address);
  }

  public static Server_Factory create(Provider<Context> contextProvider) {
    return new Server_Factory(contextProvider);
  }

  public static Server newInstance(Object context, String address) {
    return new Server((Context) context, address);
  }
}
