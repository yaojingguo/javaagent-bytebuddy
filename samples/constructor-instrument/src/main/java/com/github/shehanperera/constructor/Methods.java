package com.github.shehanperera.constructor;

import net.bytebuddy.asm.Advice;
import com.github.shehanperera.util.Util;

public class Methods {
  @Advice.OnMethodEnter
  static long enterMethods() throws Exception {
    long start = System.currentTimeMillis();
    return start;
  }

  @Advice.OnMethodExit
  static void exitMethods(@Advice.Origin String method, @Advice.Enter long start) throws Exception {
    long end = System.currentTimeMillis();
    Util.println("This Method " + method + "took " + (end - start) + " milliseconds ");
  }
}
