package com.karkoon.daggerplayground.serverandworkerseparateincomponent;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
final class DaggerContextComponent implements ContextComponent {
  private final DaggerContextComponent contextComponent = this;

  private Provider<Context> contextProvider;

  private DaggerContextComponent() {

    initialize();

  }

  public static Builder builder() {
    return new Builder();
  }

  public static ContextComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.contextProvider = DoubleCheck.provider(Context_Factory.create());
  }

  @Override
  public Context get() {
    return contextProvider.get();
  }

  @Override
  public ServerComponent server() {
    return new ServerComponentImpl(contextComponent);
  }

  @Override
  public WorkerComponent worker() {
    return new WorkerComponentImpl(contextComponent);
  }

  static final class Builder {
    private Builder() {
    }

    public ContextComponent build() {
      return new DaggerContextComponent();
    }
  }

  private static final class ServerComponentImpl implements ServerComponent {
    private final DaggerContextComponent contextComponent;

    private final ServerComponentImpl serverComponentImpl = this;

    private Server_Factory serverProvider;

    private Provider<Server.Factory> factoryProvider;

    private ServerComponentImpl(DaggerContextComponent contextComponent) {
      this.contextComponent = contextComponent;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.serverProvider = Server_Factory.create(contextComponent.contextProvider);
      this.factoryProvider = Server_Factory_Impl.create(serverProvider);
    }

    @Override
    public Server.Factory provideServerFactory() {
      return factoryProvider.get();
    }
  }

  private static final class WorkerComponentImpl implements WorkerComponent {
    private final DaggerContextComponent contextComponent;

    private final WorkerComponentImpl workerComponentImpl = this;

    private Worker_Factory workerProvider;

    private Provider<Worker.Factory> factoryProvider;

    private WorkerComponentImpl(DaggerContextComponent contextComponent) {
      this.contextComponent = contextComponent;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.workerProvider = Worker_Factory.create(contextComponent.contextProvider);
      this.factoryProvider = Worker_Factory_Impl.create(workerProvider);
    }

    @Override
    public Worker.Factory getFactory() {
      return factoryProvider.get();
    }
  }
}
