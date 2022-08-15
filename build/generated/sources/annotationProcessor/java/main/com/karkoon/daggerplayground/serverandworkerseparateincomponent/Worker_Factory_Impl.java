package com.karkoon.daggerplayground.serverandworkerseparateincomponent;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
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
public final class Worker_Factory_Impl implements Worker.Factory {
  private final Worker_Factory delegateFactory;

  Worker_Factory_Impl(Worker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public Worker get(Server server) {
    return delegateFactory.get(server);
  }

  public static Provider<Worker.Factory> create(Worker_Factory delegateFactory) {
    return InstanceFactory.create(new Worker_Factory_Impl(delegateFactory));
  }
}
