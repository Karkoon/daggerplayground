package com.karkoon.daggerplayground.serverowningworkerProblem.worker;

import com.karkoon.daggerplayground.serverowningworkerProblem.server.ServerInterface;
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
