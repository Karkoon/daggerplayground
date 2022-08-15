package com.karkoon.daggerplayground.serverowningworker.worker;

import com.karkoon.daggerplayground.serverowningworker.server.ServerInterface;
import dagger.BindsInstance;
import dagger.Subcomponent;

@WorkerScope
@Subcomponent
public interface WorkerComponent {
  Worker getWorker();

  @Subcomponent.Builder
  interface Builder {
    @BindsInstance
    Builder server(ServerInterface serverInterface);

    WorkerComponent build();
  }
}
