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
public final class Worker_Factory {
  public Worker_Factory() {
  }

  public Worker get(Server server) {
    return newInstance(server);
  }

  public static Worker_Factory create() {
    return new Worker_Factory();
  }

  public static Worker newInstance(Object server) {
    return new Worker((Server) server);
  }
}
