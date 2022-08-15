package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.worker;

import javax.inject.Inject;

@WorkerScope
class Dependency {
  private final Worker worker;

  @Inject
  Dependency(
      Worker worker
  ) {
    this.worker = worker;
  }

  void doService() {
    System.out.println(this.worker.getContext().hashCode());
  }
}
