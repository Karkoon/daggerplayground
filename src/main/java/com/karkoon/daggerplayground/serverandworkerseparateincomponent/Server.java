package com.karkoon.daggerplayground.serverandworkerseparateincomponent;


import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;

class Server {

  private final String address;
  private final Context context;

  @AssistedInject
  Server(
      Context context,
      @Assisted String address
  ) {
    this.context = context;
    this.address = address;
  }

  String getAddress() {
    return address;
  }

  public Context getContext() {
    return context;
  }

  @AssistedFactory
  interface Factory {
    Server get(
      String address
    );
  }

}
