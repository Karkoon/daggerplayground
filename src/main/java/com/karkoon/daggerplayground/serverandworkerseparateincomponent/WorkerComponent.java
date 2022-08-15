package com.karkoon.daggerplayground.serverandworkerseparateincomponent;

import dagger.Subcomponent;

@Subcomponent
interface WorkerComponent {
  Worker.Factory getFactory();
}
