package com.github.shehanperera.parameters;

import com.github.shehanperera.util.Util;
import net.bytebuddy.asm.Advice;

public class GetParameters {

  @Advice.OnMethodExit
  public static void getParameters(@Advice.Origin String method, @Advice.AllArguments Object[] para)
      throws Exception {
    Util.println(method);

    // This is use for get class of parameters to get
    // an idea what we can do using this advice
    Util.println("Parameter class names:");
    for (int i = 0; i < para.length; i++) {
      Util.println("  " + para[i].getClass());
    }

    // This is a way we can access to each parameters separately using agent advice
    // For this we want an idea about parameters class , so from above we can get class of
    // parameters and we can use them as follows or as we need.
    Util.println("Get parameters values:");
    int number = (int) para[0];
    Util.println("  number:" + number);
    String name = (String) para[1];
    Util.println("  name:" + name);
    boolean run = (boolean) para[2];
    Util.println("  run:" + run);
  }
}
