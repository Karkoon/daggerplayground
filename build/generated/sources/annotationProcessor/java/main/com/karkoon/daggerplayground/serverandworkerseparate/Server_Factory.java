package com.karkoon.daggerplayground.serverandworkerseparate;

import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
  public Server_Factory() {
  }

  public Server get(String address) {
    return newInstance(address);
  }

  public static Server_Factory create() {
    return new Server_Factory();
  }

  public static Server newInstance(String address) {
    return new Server(address);
  }
}
