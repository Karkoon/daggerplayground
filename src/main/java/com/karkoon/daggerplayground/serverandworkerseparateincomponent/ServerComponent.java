package com.karkoon.daggerplayground.serverandworkerseparateincomponent;

import dagger.Subcomponent;

@Subcomponent
interface ServerComponent {
  Server.Factory provideServerFactory();
}
