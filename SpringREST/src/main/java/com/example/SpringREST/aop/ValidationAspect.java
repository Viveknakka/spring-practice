package com.example.SpringREST.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    public static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.example.SpringREST.controller.EmployeeController.getEmployee(..)) && args(postId) || execution(* com.example.SpringREST.controller.EmployeeController.updateEmployee(..)) && args(postId)")
    public Object validateAndUpdate(ProceedingJoinPoint pjp, int postId) throws Throwable {
        if (postId < 0) {
            LOGGER.info("postId is negative, updating...");
            postId *= -1;
            LOGGER.info("postId is updated: " + postId);
        }

        // Pass the modified arguments to the target method
        return pjp.proceed(new Object[]{postId});
    }
}
