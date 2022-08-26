package com.karkoon.daggerplayground.serverowningworkerProblem.server;


import com.karkoon.daggerplayground.serverowningworkerProblem.Context;

public interface ServerInterface {
  Context getContext();

  String getAddress();
}
