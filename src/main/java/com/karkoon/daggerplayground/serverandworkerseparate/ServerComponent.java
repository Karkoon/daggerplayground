package com.karkoon.daggerplayground.serverandworkerseparate;

import dagger.Component;

@Component
interface ServerComponent {
  Server.Factory provideServerFactory();
}
