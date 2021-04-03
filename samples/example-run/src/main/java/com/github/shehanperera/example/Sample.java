package com.github.shehanperera.example;

import java.lang.reflect.Field;

/** Sample class for run and test agents */
public class Sample {

  public static void main(String[] args) throws Exception {
    System.out.println("This is Sample main");

    Method method = new Method();
    method.method1();
    method.method2();
    method.method4(4, "parameters", true);

    System.out.printf("class: %s\n", method.getClass());

//    Field field = method.getClass().getDeclaredField("word");
//    field.setAccessible(true);
//    Object value = field.get(method);
//    System.out.printf("field value: %s\n", value);
  }
}
