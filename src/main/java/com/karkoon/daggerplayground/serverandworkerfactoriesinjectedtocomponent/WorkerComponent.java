package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent;

import dagger.Subcomponent;

@Subcomponent
public interface WorkerComponent {
  Worker getWorker();
}
