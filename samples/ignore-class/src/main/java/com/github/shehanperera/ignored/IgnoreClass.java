package com.github.shehanperera.ignored;

import com.github.shehanperera.util.Util;
import net.bytebuddy.asm.Advice;

public class IgnoreClass {
  @Advice.OnMethodExit
  public static void enterMethods(@Advice.Origin String method) throws Exception {
    Util.println("method: " + method);
  }
}
