package com.karkoon.daggerplayground.serverowningworker;

import com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.DaggerApplicationComponent;

public class Main {
  public static void main(String[] args) {
    var context = DaggerApplicationComponent.create();
    context.get().run();
  }
}
