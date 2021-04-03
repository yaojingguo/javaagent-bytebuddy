package com.github.shehanperera.addfield;

import java.lang.instrument.Instrumentation;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;

import com.github.shehanperera.util.Util;

/** This is the agent for set and get values form running class */
public class Agent {
  public static void premain(String arguments, Instrumentation instrumentation) {
    Util.println("Agent for add fields ");

    new AgentBuilder.Default()
        .with(new AgentBuilder.InitializationStrategy.SelfInjection.Eager())
        .type((ElementMatchers.nameContains("Method")))
        .transform(
            (builder, typeDescription, classLoader, module) ->
                builder
                    .defineField("bool", Boolean.class)
                    .defineField("word", String.class)
                    .constructor(ElementMatchers.any())
                    .intercept(Advice.to(SetField.class))
                    .method(ElementMatchers.nameContains("method2"))
                    .intercept(Advice.to(GetField.class)))
        .installOn(instrumentation);
  }
}
