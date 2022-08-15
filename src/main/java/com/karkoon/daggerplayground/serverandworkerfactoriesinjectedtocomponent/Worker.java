package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent;


import com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server.ServerInterface;

import javax.inject.Inject;

public class Worker {

  private final Context context;
  private final ServerInterface server;

  @Inject
  public Worker(
      Context context,
      ServerInterface server
  ) {
    this.context = context;
    this.server = server;
  }

  public void work() {
    System.out.println("########");
    System.out.println("Context: " + context.hashCode());
    System.out.println("Server: " + server.getAddress() + " " + server.hashCode());
    System.out.println("Worker: " + this.hashCode());
  }
}
