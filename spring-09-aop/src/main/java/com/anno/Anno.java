package com.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class Anno {
    //第一个*必须有，第二个星表示全部，括号点点表示所有参数
    @Before("execution(* com.cy.UserServiceimp.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }
    @After("execution(* com.cy.UserServiceimp.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }
    //环绕可以得到被切入的方法
    //环绕增强中，我们可以给当一个参数，代表我们获得处理的切入的点
    @Around("execution(* com.cy.UserServiceimp.*(..))")
    public void aroud(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        Signature signature = joinPoint.getSignature();
        System.out.println("被切入的方法是"+signature);
        joinPoint.proceed();
        System.out.println("环绕后");

    }
}
