package com.karkoon.daggerplayground.serverowningworker.server;


import com.karkoon.daggerplayground.serverowningworker.Context;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;

public class Server implements ServerInterface {

  private final String address;
  private final Context context;

  @AssistedInject
  public Server(
      Context context,
      @Assisted String address
  ) {
    this.context = context;
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public Context getContext() {
    return context;
  }

  @AssistedFactory
  public interface Factory {
    public Server get(
        String address
    );
  }

}
