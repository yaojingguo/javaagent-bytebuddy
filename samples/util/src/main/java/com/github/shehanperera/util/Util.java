package com.github.shehanperera.util;

public class Util {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
  public static final String AGENT_PREFIX = ANSI_GREEN + "[Agent]" + ANSI_RESET;

  public static void println(String x) {
    System.out.println(AGENT_PREFIX + " " + x);
  }

  public static void printf(String format, Object ... args) {
    System.out.printf(AGENT_PREFIX + " " + format, args);
  }
  public static void sleep(int mills) {
    try {
      Thread.sleep(mills);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
