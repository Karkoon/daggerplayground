package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent;

import com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.worker.WorkerModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(
    modules = {
        WorkerModule.class
    }
)
public interface ApplicationComponent {

  Application get();

}
