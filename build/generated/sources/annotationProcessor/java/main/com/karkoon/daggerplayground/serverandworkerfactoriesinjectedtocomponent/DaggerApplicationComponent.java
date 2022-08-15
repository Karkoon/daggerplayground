package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent;

import com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server.Server;
import com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server.ServerInterface;
import com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server.Server_Factory;
import com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server.Server_Factory_Impl;
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
public final class DaggerApplicationComponent implements ApplicationComponent {
  private final DaggerApplicationComponent applicationComponent = this;

  private Provider<Context> contextProvider;

  private Server_Factory serverProvider;

  private Provider<Server.Factory> factoryProvider;

  private DaggerApplicationComponent() {

    initialize();

  }

  public static Builder builder() {
    return new Builder();
  }

  public static ApplicationComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.contextProvider = DoubleCheck.provider(Context_Factory.create());
    this.serverProvider = Server_Factory.create(contextProvider);
    this.factoryProvider = Server_Factory_Impl.create(serverProvider);
  }

  @Override
  public Application get() {
    return new Application(contextProvider.get(), new WorkerComponentBuilder(applicationComponent), factoryProvider.get());
  }

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder workerModule(WorkerModule workerModule) {
      Preconditions.checkNotNull(workerModule);
      return this;
    }

    public ApplicationComponent build() {
      return new DaggerApplicationComponent();
    }
  }

  private static final class WorkerComponentBuilder implements WorkerComponent.Builder {
    private final DaggerApplicationComponent applicationComponent;

    private ServerInterface server;

    private WorkerComponentBuilder(DaggerApplicationComponent applicationComponent) {
      this.applicationComponent = applicationComponent;
    }

    @Override
    public WorkerComponentBuilder server(ServerInterface arg0) {
      this.server = Preconditions.checkNotNull(arg0);
      return this;
    }

    @Override
    public WorkerComponent build() {
      Preconditions.checkBuilderRequirement(server, ServerInterface.class);
      return new WorkerComponentImpl(applicationComponent, server);
    }
  }

  private static final class WorkerComponentImpl implements WorkerComponent {
    private final ServerInterface server;

    private final DaggerApplicationComponent applicationComponent;

    private final WorkerComponentImpl workerComponentImpl = this;

    private WorkerComponentImpl(DaggerApplicationComponent applicationComponent,
        ServerInterface serverParam) {
      this.applicationComponent = applicationComponent;
      this.server = serverParam;

    }

    @Override
    public Worker getWorker() {
      return new Worker(applicationComponent.contextProvider.get(), server);
    }
  }
}