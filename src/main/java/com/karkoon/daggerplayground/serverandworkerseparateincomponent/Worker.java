package com.karkoon.daggerplayground.serverandworkerseparateincomponent;

import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;

class Worker {

  private final Context context;
  private final Server server;

  void work() {
    System.out.println(server.getAddress());
    System.out.println("context: " + (context == server.getContext()));
  }

  @AssistedInject
  Worker(
      Context context,
      @Assisted Server server
  ) {
    this.context = context;
    this.server = server;
  }

  @AssistedFactory
  interface Factory {
    Worker get(Server server);
  }
}
