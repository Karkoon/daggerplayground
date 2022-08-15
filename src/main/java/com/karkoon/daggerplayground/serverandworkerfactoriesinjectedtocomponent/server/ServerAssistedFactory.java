package com.karkoon.daggerplayground.serverandworkerfactoriesinjectedtocomponent.server;

public interface ServerAssistedFactory {
  Server get(
      String address
  );
}
