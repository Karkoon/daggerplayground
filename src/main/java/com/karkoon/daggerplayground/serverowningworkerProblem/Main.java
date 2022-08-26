package com.karkoon.daggerplayground.serverowningworkerProblem;

public class Main {
  public static void main(String[] args) {
    var context = DaggerApplicationComponent.create();
    context.get().run();
  }
}
