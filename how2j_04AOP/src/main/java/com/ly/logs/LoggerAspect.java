package com.ly.logs;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 辅助日志功能
 */
public class LoggerAspect {
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log:" + joinPoint.getSignature().getName());
        return object;
    }
}
