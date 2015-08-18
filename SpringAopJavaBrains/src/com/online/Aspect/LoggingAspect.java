package com.online.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/*import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.online.Model.Circle;
*/
@Aspect
public class LoggingAspect {

	/*@After("execution(public String getName())")
	public void afterInvoke()
	{
		System.out.println("After get method this will execute.");
	}
	*/
	/*@AfterReturning("execution(public void getName())")
	public void afterReturn()
	{
		System.out.println("After get method will return this one will execute means no exception.");
	}
	*/
	
	/*@AfterReturning(pointcut="args(name)",returning="returningString")
	public void afterReturnValue(String name,String returningString)
	{
		System.out.println("After get method will return this one will execute means no exception"+returningString);
	}
*/
/*	@AfterThrowing("execution(public void getName())")
	public void afterThrowing()
	{
		System.out.println("Here exception is thrown");
	}
	*/
	/*
	 * MAKE SURE TO COMMENT CIRCLE PROPERTY IN spring.xml when using this otherwise at the time of initialization
	 * it will throw exception
	 * 
	 * @AfterThrowing(pointcut="args(name)",throwing="exception")
	public void afterThrowingPointCut(String name,RuntimeException exception)
	{
		System.out.println("Here exception is thrown"+exception);
	}
	*/
	
	/*@Before("overAll()")
	public void printBefore1()
	{
		System.out.println("Print 1");
	}
	
	@Before("overAll()")
	public void printBefore2()
	{
		System.out.println("Print 2");
	}
	*/
	/*@Before("overAllWithin()")
	public void printBefore3(JoinPoint joinPoint)
	{
		System.out.println(joinPoint.toString());
		Circle circle=(Circle)joinPoint.getTarget();
		System.out.println("Print 3"+circle.getName());
	}
	
	@Before("args(name)")
	public void stringArgumets(String name)
	{
		System.out.println("String argument method is called."+name);
	}
	*/
	
	/*@Pointcut("execution(public String com.online.Model.Circle.getName(..))")
	public void overAll(){}
	*/
	/*@Pointcut("within(com.online.Model.Circle)")
	public void overAllWithin(){}
	*/
	/*@Pointcut("within(com.online.Model..*)")
	public void overAllWithinSubAllPackgae(){}
	*/
	
	@Pointcut("execution(* get*(..))")
	public void allGetters(){}
	
	@Around("allGetters()")
	public Object arroundMethod(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object returnvalue=null;
		try {
			System.out.println("Before Getter method is executing");
			returnvalue=proceedingJoinPoint.proceed();
			System.out.println("After Getter method is executing");
		} catch (Throwable e) {
			System.out.println("Exception is occure.");
		}
		
		System.out.println("After finally executed.");
		return returnvalue;
	}
	
	
	
	
}
