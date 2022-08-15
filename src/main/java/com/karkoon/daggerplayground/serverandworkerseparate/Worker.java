package com.karkoon.daggerplayground.serverandworkerseparate;

import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;

class Worker {

  private final Server server;

  @AssistedInject
  Worker(
      @Assisted Server server
  ) {
    this.server = server;
  }

  void work() {
    System.out.println(server.getAddress());
  }

  @AssistedFactory
  interface Factory {
    Worker get(Server server);
  }
}
