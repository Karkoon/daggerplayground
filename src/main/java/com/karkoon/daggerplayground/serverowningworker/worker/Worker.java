package com.karkoon.daggerplayground.serverowningworker.worker;


import com.karkoon.daggerplayground.serverowningworker.Context;
import com.karkoon.daggerplayground.serverowningworker.server.ServerInterface;
import dagger.Lazy;

import javax.inject.Inject;

@WorkerScope
public class Worker {

  private final Context context;
  private final ServerInterface server;
  private final Lazy<Dependency> dependencyLazy;

  @Inject
  public Worker(
      Context context,
      ServerInterface server,
      Lazy<Dependency> dependencyLazy
  ) {
    this.context = context;
    this.server = server;
    this.dependencyLazy = dependencyLazy;
  }

  public void work() {
    System.out.println("########");
    System.out.println("Context: " + context.hashCode() + " " + server.getContext().hashCode());
    System.out.println("Server: " + server.getAddress() + " " + server.hashCode());
    System.out.println("Worker: " + this.hashCode());
    dependencyLazy.get().doService();
  }

  public Context getContext() {
    return context;
  }
}
