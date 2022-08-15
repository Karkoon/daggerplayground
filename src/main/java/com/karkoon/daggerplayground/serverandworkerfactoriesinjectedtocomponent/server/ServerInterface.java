package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server;


import com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.Context;

public interface ServerInterface {
  Context getContext();

  String getAddress();
}
