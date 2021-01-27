package com.radha;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
    @Before(value = "execution(* com.radha.EmployeeService.*(..)) and args(name,empId)")
    public void beforeAdvice(JoinPoint joinPoint,String name,String empId){
        System.out.println("before method: "+joinPoint.getSignature());

        System.out.println("Creating employee with name : "+name+" and emp id : "+empId);
    }

    @After(value = "execution(* com.radha.EmployeeService.*(..)) and args(name,empId)")
    public void afterAdvice(JoinPoint joinPoint,String name, String empId){
        System.out.println("after method: "+joinPoint.getSignature());

        System.out.println("Successfully created employee with name : "+name+" and id : "+empId);
    }
}
