package com.github.shehanperera.addfield;

import com.github.shehanperera.util.Util;
import net.bytebuddy.asm.Advice;

/** In this class we set the bool and word values after the constructor */
public class SetField {
  @Advice.OnMethodExit
  public static void setValues(
      @Advice.FieldValue(value = "bool", readOnly = false) boolean bool,
      @Advice.FieldValue(value = "word", readOnly = false) String word)
      throws Exception {
    bool = true;
    word = "New String Field";
    Util.printf("Adding boolean (%b) and String (%s) Fields\n", bool, word);
  }
}
