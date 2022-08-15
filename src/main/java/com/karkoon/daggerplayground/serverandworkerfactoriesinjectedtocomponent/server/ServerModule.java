package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server;

import dagger.Module;
import dagger.Provides;

@Module(
    subcomponents = ServerComponent.class
)
public class ServerModule {

  public ServerModule() {

  }

  @Provides
  public ServerInterface serverFactory(ServerComponent.Factory serverComponent) {
    return serverComponent.get().provideServerFactory().get("aa");
  }

}
