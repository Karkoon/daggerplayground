package com.karkoon.daggerplayground.serverandworkerseparate;

import dagger.Component;

@Component
interface WorkerComponent {
  Worker.Factory getFactory();
}
