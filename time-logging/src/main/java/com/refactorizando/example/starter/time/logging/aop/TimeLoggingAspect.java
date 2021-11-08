package com.refactorizando.example.starter.time.logging.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class TimeLoggingAspect {

  private final Logger log;

  public TimeLoggingAspect(String loggerName) {
    log = LoggerFactory.getLogger(loggerName);
  }

  @Pointcut("@annotation(com.refactorizando.example.starter.time.logging.TimeLogging)")
  public void executeTiming() {
  }

  @Around("executeTiming()")
  public Object logMethodTiming(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

    long startTime = System.currentTimeMillis();

    Object returnValue = proceedingJoinPoint.proceed();

    long totalTime = System.currentTimeMillis() - startTime;

    log.info("Total time to processed the method '{}' is {} ms", proceedingJoinPoint.getSignature().getName(),
        totalTime);

    return returnValue;
  }
}
