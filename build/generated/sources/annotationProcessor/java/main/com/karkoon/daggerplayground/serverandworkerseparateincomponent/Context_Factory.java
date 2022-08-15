package com.karkoon.daggerplayground.serverandworkerseparateincomponent;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class Context_Factory implements Factory<Context> {
  @Override
  public Context get() {
    return newInstance();
  }

  public static Context_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Context newInstance() {
    return new Context();
  }

  private static final class InstanceHolder {
    private static final Context_Factory INSTANCE = new Context_Factory();
  }
}
