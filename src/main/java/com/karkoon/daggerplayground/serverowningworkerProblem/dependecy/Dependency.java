package com.karkoon.daggerplayground.serverowningworkerProblem.dependecy;

import com.karkoon.daggerplayground.serverowningworkerProblem.server.ServerInterface;
import com.karkoon.daggerplayground.serverowningworkerProblem.worker.Worker;
import com.karkoon.daggerplayground.serverowningworkerProblem.worker.WorkerScope;

import javax.inject.Inject;

@WorkerScope
public class Dependency {
  private final Worker worker;
  private final ServerInterface serverInterface;

  @Inject
  public Dependency(
      Worker worker,
      ServerInterface serverInterface
  ) {
    this.worker = worker;
    this.serverInterface = serverInterface;
  }

  public void doService() {
    System.out.println(this.worker.getContext().hashCode());
    System.out.println("dependency " + hashCode() + " using server " + serverInterface.getAddress() + " " + serverInterface.hashCode());
  }
}
