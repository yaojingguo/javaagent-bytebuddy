package com.github.shehanperera.allmethods;

import com.github.shehanperera.util.Util;
import net.bytebuddy.asm.Advice;

public class AllMethod {

  @Advice.OnMethodExit
  static void getAllMethods(@Advice.Origin String method) throws Exception {
    Util.println(method);
  }
}
