package com.github.shehanperera.ignored;

import com.github.shehanperera.util.Util;
import net.bytebuddy.asm.Advice;

public class IgnoreClass {
  @Advice.OnMethodExit
  public static void enterMethods(@Advice.Origin String method) throws Exception {
    // If Util.println is used, there will be the following error:
    //   Error: A JNI error has occurred, please check your installation and try again
    System.out.println("[Agent] method: " + method);
  }
}
