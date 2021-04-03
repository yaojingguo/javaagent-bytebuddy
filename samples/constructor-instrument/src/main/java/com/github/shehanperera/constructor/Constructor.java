package com.github.shehanperera.constructor;

import net.bytebuddy.asm.Advice;
import com.github.shehanperera.util.Util;

public class Constructor {

  @Advice.OnMethodEnter
  static long enterConstructor() throws Exception {
    long start = System.currentTimeMillis();
    return start;
  }

  @Advice.OnMethodExit
  static void exitConstructor(@Advice.Origin String method, @Advice.Enter long start)
      throws Exception {
    long end = System.currentTimeMillis();
    Util.println("This is Constructor :" + method + "took " + (end - start) + " milliseconds ");
  }
}
