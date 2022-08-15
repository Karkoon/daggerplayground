package com.karkoon.daggerplayground.serverandworkerseparate;

import dagger.internal.DaggerGenerated;
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
final class DaggerWorkerComponent implements WorkerComponent {
  private final DaggerWorkerComponent workerComponent = this;

  private Worker_Factory workerProvider;

  private Provider<Worker.Factory> factoryProvider;

  private DaggerWorkerComponent() {

    initialize();

  }

  public static Builder builder() {
    return new Builder();
  }

  public static WorkerComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.workerProvider = Worker_Factory.create();
    this.factoryProvider = Worker_Factory_Impl.create(workerProvider);
  }

  @Override
  public Worker.Factory getFactory() {
    return factoryProvider.get();
  }

  static final class Builder {
    private Builder() {
    }

    public WorkerComponent build() {
      return new DaggerWorkerComponent();
    }
  }
}
