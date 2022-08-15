package com.karkoon.daggerplayground.serverowningworker;

import com.karkoon.daggerplayground.serverowningworker.server.Server;
import com.karkoon.daggerplayground.serverowningworker.worker.WorkerComponent;

import javax.inject.Inject;

public class Application {
  private final Context context;
  private final Server.Factory serverFactory;

  @Inject
  public Application(
      Context context,
      Server.Factory serverFactory
  ) {
    this.context = context;
    this.serverFactory = serverFactory;
  }

  public void run() {
    serverFactory.get("abc").run();
    //serverFactory.get("def").run();
  }
}
