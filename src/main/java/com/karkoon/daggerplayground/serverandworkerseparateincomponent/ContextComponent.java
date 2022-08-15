package com.karkoon.daggerplayground.serverandworkerseparateincomponent;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component
interface ContextComponent {

  ServerComponent server();
  WorkerComponent worker();
  Context get();

}
