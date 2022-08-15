package com.karkoon.daggerplayground.serverowningworker.server;


import com.karkoon.daggerplayground.serverowningworker.Context;
import com.karkoon.daggerplayground.serverowningworker.worker.WorkerComponent;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;

public class Server implements ServerInterface {

  private final WorkerComponent.Builder builder;
  private final String address;
  private final Context context;

  @AssistedInject
  public Server(
      Context context,
      WorkerComponent.Builder builder,
      @Assisted String address
  ) {
    this.context = context;
    this.builder = builder;
    this.address = address;
  }

  public void run() {
    builder.server(this).build().getWorker().work();
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
