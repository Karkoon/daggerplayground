package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.worker;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Qualifier
@Retention(RetentionPolicy.CLASS)
public @interface WorkerScope {
}