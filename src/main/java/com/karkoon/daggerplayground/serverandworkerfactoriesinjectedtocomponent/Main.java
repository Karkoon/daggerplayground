package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent;

public class Main {
  public static void main(String[] args) {
    var context = DaggerContextComponent.create();
    context.worker().getWorker().work();
    context.worker().getWorker().work();
  }
}
