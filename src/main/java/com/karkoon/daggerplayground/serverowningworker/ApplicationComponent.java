package com.karkoon.daggerplayground.serverowningworker;

import com.karkoon.daggerplayground.serverowningworker.worker.WorkerModule;
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
