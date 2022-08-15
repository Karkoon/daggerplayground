package com.karkoon.daggerplayground.serverandworkerseparate;


import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;

class Server {

  private final String address;

  @AssistedInject
  Server(
      @Assisted String address
  ) {
    this.address = address;
  }

  String getAddress() {
    return address;
  }

  @AssistedFactory
  interface Factory {
    Server get(
        String address
    );
  }

}
