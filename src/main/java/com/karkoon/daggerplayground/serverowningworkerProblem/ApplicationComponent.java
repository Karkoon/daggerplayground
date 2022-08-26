package com.karkoon.daggerplayground.serverowningworkerProblem;

import com.karkoon.daggerplayground.serverowningworkerProblem.worker.WorkerModule;
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
