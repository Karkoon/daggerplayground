package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent;

import com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server.ServerModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(
    modules = {
        ServerModule.class
    }
)
public interface ContextComponent {

  WorkerComponent worker();
  Context get();

}
