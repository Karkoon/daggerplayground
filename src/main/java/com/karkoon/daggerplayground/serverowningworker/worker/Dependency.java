package com.karkoon.daggerplayground.serverowningworker.worker;

import com.karkoon.daggerplayground.serverowningworker.server.ServerInterface;

import javax.inject.Inject;

@WorkerScope
class Dependency {
  private final Worker worker;
  private final ServerInterface serverInterface;

  @Inject
  Dependency(
      Worker worker,
      ServerInterface serverInterface
  ) {
    this.worker = worker;
    this.serverInterface = serverInterface;
  }

  void doService() {
    System.out.println(this.worker.getContext().hashCode());
    System.out.println("services server " + serverInterface.getAddress() + " " + serverInterface.hashCode());
  }
}
