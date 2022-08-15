package com.karkoon.daggerplayground.serverowningworker.server;


import com.karkoon.daggerplayground.serverowningworker.Context;

public interface ServerInterface {
  Context getContext();

  String getAddress();
}
