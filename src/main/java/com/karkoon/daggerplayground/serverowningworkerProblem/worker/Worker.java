package com.karkoon.daggerplayground.serverowningworkerProblem.worker;


import com.karkoon.daggerplayground.serverowningworkerProblem.Context;
import com.karkoon.daggerplayground.serverowningworkerProblem.dependecy.Dependency;
import com.karkoon.daggerplayground.serverowningworkerProblem.dependency_using_dependency.DependencyTwo;
import com.karkoon.daggerplayground.serverowningworkerProblem.server.ServerInterface;
import dagger.Lazy;

import javax.inject.Inject;

@WorkerScope
public class Worker {

  private final Context context;
  private final ServerInterface server;
  private final Lazy<Dependency> dependencyLazy;
  private final Lazy<DependencyTwo> dependencyTwoLazy;

  @Inject
  public Worker(
      Context context,
      ServerInterface server,
      Lazy<Dependency> dependencyLazy,
      Lazy<DependencyTwo> dependencyTwoLazy
  ) {
    this.context = context;
    this.server = server;
    this.dependencyLazy = dependencyLazy;
    this.dependencyTwoLazy = dependencyTwoLazy;
  }

  public void work() {
    System.out.println("########");
    System.out.println("Context: " + context.hashCode() + " " + server.getContext().hashCode());
    System.out.println("Server: " + server.getAddress() + " " + server.hashCode());
    System.out.println("Worker: " + this.hashCode());
    dependencyLazy.get().doService();
    dependencyTwoLazy.get().doService();
  }

  public Context getContext() {
    return context;
  }
}
