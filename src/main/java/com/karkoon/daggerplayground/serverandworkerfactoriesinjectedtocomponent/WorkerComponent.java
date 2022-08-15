package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent;

import com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server.ServerInterface;
import dagger.BindsInstance;
import dagger.Subcomponent;

@Subcomponent
public interface WorkerComponent {
  Worker getWorker();

  @Subcomponent.Builder
  interface Builder {
    @BindsInstance Builder server(ServerInterface serverInterface);
    WorkerComponent build();
  }
}
