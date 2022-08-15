package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server;


import com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.Context;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;

public class Server implements ServerInterface {

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

  public String getAddress() {
    return address;
  }

  public Context getContext() {
    return context;
  }

  @AssistedFactory
  public interface Factory {
    Server get(
        String address
    );
  }

}
