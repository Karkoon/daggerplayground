package com.karkoon.daggerplayground.serverowningworkerProblem.server;


import com.karkoon.daggerplayground.serverowningworkerProblem.Context;
import com.karkoon.daggerplayground.serverowningworkerProblem.worker.WorkerComponent;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;

public class Server implements ServerInterface {

  private final WorkerComponent builder;
  private final String address;
  private final Context context;

  @AssistedInject
  public Server(
      Context context,
      WorkerComponent.Builder builder,
      @Assisted String address
  ) {
    this.context = context;
    this.builder = builder.server(this).build();
    this.address = address;
  }

  public void run() {
   builder.getWorker().work();
   builder.getWorker().work();
   builder.getWorker().work();
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
