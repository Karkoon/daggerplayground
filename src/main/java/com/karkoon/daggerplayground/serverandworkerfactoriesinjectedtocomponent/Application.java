package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent;

import com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server.Server;

import javax.inject.Inject;

public class Application {
  private final Context context;
  private final WorkerComponent.Builder builder;
  private final Server.Factory serverFactory;

  @Inject
  public Application(
      Context context,
      WorkerComponent.Builder builder,
      Server.Factory serverComponent
  ) {
    this.context = context;
    this.builder = builder;
    this.serverFactory = serverComponent;
  }

  public void run() {
    builder.server(serverFactory.get("abc")).build().getWorker().work();
    builder.server(serverFactory.get("def")).build().getWorker().work();
  }
}
