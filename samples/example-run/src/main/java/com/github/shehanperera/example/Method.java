package com.github.shehanperera.example;

public class Method {
  public Method() {
    println("This is constructor ");
  }

  public void method1() {
    Util.sleep(500);
    println("This is Method 1");
  }

  public void method2() {
    Util.sleep(1000);
    println("This is Method 2");
  }

  public void method4(int number, String word, boolean bool) {
    println("String: " + word + ", number: " + number + ", and boolean: " + bool);
  }

  public static void println(String x) {
    System.out.println("[Method] " + x);
  }
}
