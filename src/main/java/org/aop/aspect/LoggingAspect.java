package org.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allGetters()")
    public void loggingAdvice(){
        System.out.println("Advice run. Get Method called");
    }

    @After("allGetters()")
    public void loggingSecondAdvice(){
        System.out.println("Second Advice run. Get Method called");
    }

    @Pointcut("execution(public * get*(..))")
    public void allGetters(){}
}
