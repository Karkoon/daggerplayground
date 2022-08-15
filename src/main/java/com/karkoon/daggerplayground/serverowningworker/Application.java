package com.karkoon.daggerplayground.serverowningworker;

import com.karkoon.daggerplayground.serverowningworker.server.Server;
import com.karkoon.daggerplayground.serverowningworker.worker.WorkerComponent;

import javax.inject.Inject;

public class Application {
  private final Context context;
  private final WorkerComponent.Builder builder;
  private final Server.Factory serverFactory;

  @Inject
  public Application(
      Context context,
      WorkerComponent.Builder builder,
      Server.Factory serverFactory
  ) {
    this.context = context;
    this.builder = builder;
    this.serverFactory = serverFactory;
  }

  public void run() {
    builder.server(serverFactory.get("abc")).build().getWorker().work();
    builder.server(serverFactory.get("def")).build().getWorker().work();
  }
}
