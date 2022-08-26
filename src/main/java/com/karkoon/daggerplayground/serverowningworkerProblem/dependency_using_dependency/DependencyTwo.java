package com.karkoon.daggerplayground.serverowningworkerProblem.dependency_using_dependency;

import com.karkoon.daggerplayground.serverowningworkerProblem.dependecy.Dependency;
import com.karkoon.daggerplayground.serverowningworkerProblem.worker.WorkerScope;

import javax.inject.Inject;

@WorkerScope
public class DependencyTwo {

  private final Dependency dependency;

  @Inject
  public DependencyTwo(
      Dependency dependency
  ) {
    this.dependency = dependency;
  }

  public void doService() {
    System.out.println("dependencyTwo start" + hashCode());
    dependency.doService();
    System.out.println("dependencyTwo end" + hashCode());
  }
}
