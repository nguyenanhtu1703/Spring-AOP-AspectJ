package com.nguyenanhtu.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
   @Around("execution(* com.nguyenanhtu.customer.bo.CustomerBo.addCustomerAround(..))")
    public void logAfterThrowing(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("logAround() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("hijacked : " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("Around before is running!");
		//joinPoint.proceed();
		joinPoint.proceed();
		System.out.println("Around after is running!");
		System.out.println("******");
   }
}