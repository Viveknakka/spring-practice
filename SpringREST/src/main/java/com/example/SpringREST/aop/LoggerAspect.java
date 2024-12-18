package com.example.SpringREST.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {
    public static final Logger LOGGER= LoggerFactory.getLogger(LoggerAspect.class);
    @Before("execution(* com.example.SpringREST.controller.EmployeeController.*(..))")
    public void logMethodCalled(JoinPoint jp){
        LOGGER.info("Method Called:"+jp.getSignature().getName()+"()");
    }
    @After("execution(* com.example.SpringREST.controller.EmployeeController.*(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Executed:"+jp.getSignature().getName()+"()");
    }
    @AfterThrowing("execution(* com.example.SpringREST.controller.EmployeeController.*(..))")
    public void logMethodCrash(JoinPoint jp){
        LOGGER.info("Method Crashes:"+jp.getSignature().getName()+"() fix the issues...");
    }
    @AfterReturning("execution(* com.example.SpringREST.controller.EmployeeController.*(..))")
    public void logMethodReturned(JoinPoint jp){
        LOGGER.info("Method Executed Successfully:"+jp.getSignature().getName()+"()");
    }

}
