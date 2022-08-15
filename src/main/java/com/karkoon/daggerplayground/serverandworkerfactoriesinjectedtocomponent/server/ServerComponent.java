package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server;

import dagger.Subcomponent;

@Subcomponent
public interface ServerComponent {
  Server.Factory provideServerFactory();

  @Subcomponent.Factory
  public interface Factory {
    ServerComponent get();
  }
}
