package com.github.shehanperera.example;

public class Util {
  public static void sleep(int mills) {
    try {
      Thread.sleep(mills);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
