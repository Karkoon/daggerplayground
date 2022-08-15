package com.karkoon.daggerplayground.serverandworkerseparateincomponent;

class Main {
  public static void main(String[] args) {
    var context = DaggerContextComponent.create();
    var server = context.server().provideServerFactory().get("moj adres");
    var worker = context.worker().getFactory().get(server);
    worker.work();
  }
}
