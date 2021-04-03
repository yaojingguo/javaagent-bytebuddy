package com.github.shehanperera.example;

public class Method {
  public Method() {
    System.out.println("[Method] " + "This is constructor ");
  }

  public void method1() {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("[Method] " + "This is Method 1");
  }

  public void method2() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("[Method] " + "This is Method 2");
  }

  public void method4(int number, String word, boolean bool) {
    System.out.println("[Method] " + "String: " + word + ", number: " + number + ", and boolean: " + bool);
  }
}
