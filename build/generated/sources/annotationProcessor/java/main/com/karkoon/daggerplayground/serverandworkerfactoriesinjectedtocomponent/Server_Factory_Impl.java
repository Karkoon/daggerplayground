package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent;

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
public final class Server_Factory_Impl implements Server.Factory {
  private final Server_Factory delegateFactory;

  Server_Factory_Impl(Server_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public Server get(String address) {
    return delegateFactory.get(address);
  }

  public static Provider<Server.Factory> create(Server_Factory delegateFactory) {
    return InstanceFactory.create(new Server_Factory_Impl(delegateFactory));
  }
}
