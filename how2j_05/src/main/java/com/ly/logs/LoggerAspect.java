package com.ly.logs;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 辅助日志功能
 */
@Aspect  // 表示这是一个切面
@Component // 表示这是一个bean，由spring管理
public class LoggerAspect {
    // 表示对 com.ly.service.ProductService 这个类中的所有方法进行切面操作
    @Around(value = "execution(* com.ly.service.ProductService.* (..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log:" + joinPoint.getSignature().getName());
        return object;
    }
}
