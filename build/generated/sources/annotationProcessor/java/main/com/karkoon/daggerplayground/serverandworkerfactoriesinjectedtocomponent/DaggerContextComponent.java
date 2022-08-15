package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
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
public final class DaggerContextComponent implements ContextComponent {
  private final ServerModule serverModule;

  private final DaggerContextComponent contextComponent = this;

  private Provider<Context> contextProvider;

  private DaggerContextComponent(ServerModule serverModuleParam) {
    this.serverModule = serverModuleParam;
    initialize(serverModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  public static ContextComponent create() {
    return new Builder().build();
  }

  private ServerInterface serverInterface() {
    return ServerModule_ServerFactoryFactory.serverFactory(serverModule, new ServerComponentFactory(contextComponent));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ServerModule serverModuleParam) {
    this.contextProvider = DoubleCheck.provider(Context_Factory.create());
  }

  @Override
  public Context get() {
    return contextProvider.get();
  }

  @Override
  public WorkerComponent worker() {
    return new WorkerComponentImpl(contextComponent);
  }

  public static final class Builder {
    private ServerModule serverModule;

    private Builder() {
    }

    public Builder serverModule(ServerModule serverModule) {
      this.serverModule = Preconditions.checkNotNull(serverModule);
      return this;
    }

    public ContextComponent build() {
      if (serverModule == null) {
        this.serverModule = new ServerModule();
      }
      return new DaggerContextComponent(serverModule);
    }
  }

  private static final class ServerComponentFactory implements ServerComponent.Factory {
    private final DaggerContextComponent contextComponent;

    private ServerComponentFactory(DaggerContextComponent contextComponent) {
      this.contextComponent = contextComponent;
    }

    @Override
    public ServerComponent get() {
      return new ServerComponentImpl(contextComponent);
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

    private WorkerComponentImpl(DaggerContextComponent contextComponent) {
      this.contextComponent = contextComponent;


    }

    @Override
    public Worker getWorker() {
      return new Worker(contextComponent.contextProvider.get(), contextComponent.serverInterface());
    }
  }
}
