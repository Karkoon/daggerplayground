package com.karkoon.daggerplayground.serverandworkerseparate;

class Application {
  public static void main(String[] args) {
    var comp = DaggerServerComponent.create();
    var server = comp.provideServerFactory().get("aaaa");
    DaggerWorkerComponent.create().getFactory().get(server).work();
  }
}
