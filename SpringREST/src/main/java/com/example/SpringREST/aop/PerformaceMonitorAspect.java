package com.example.SpringREST.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformaceMonitorAspect {
    public static  final Logger LOGGER= LoggerFactory.getLogger(PerformaceMonitorAspect.class);
    @Around("execution(* com.example.SpringREST.controller.EmployeeController.*(..))")
    public  Object monitorTime(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object obj=pjp.proceed();
        long endTime = System.currentTimeMillis();
        LOGGER.info("Time Taken By:"+pjp.getSignature().getName()+"() : "+(endTime-startTime)+" milli seconds....");
        return  obj;
    }

}
