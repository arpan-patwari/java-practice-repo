package com.example.Springtransactionexample.cofig;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Configuration
public class AnnotationConfig {

	/*
	 * @Pointcut(
	 * "@annotation(org.springframework.web.bind.annotation.RequestMapping)") public
	 * void anyNobleAnnotated() { System.out.println("test"); }
	 * 
	 * @After("anyNobleAnnotated() && @annotation(com.example.Springtransactionexample.annotation.NobleAnnotation)"
	 * ) public Object appendQuestionMark(ProceedingJoinPoint joinPoint) throws
	 * Throwable { Object[] arguments = joinPoint.getArgs();
	 * 
	 * log.info("The value for noble annptation is " + arguments[0]); return
	 * joinPoint.proceed(new Object[] { ((String) arguments[0]) +
	 * " after annotation" }); }
	 */

	/*
	 * @Around(
	 * "@annotation(com.example.Springtransactionexample.annotation.NobleAnnotation)")
	 * public Object translate(ProceedingJoinPoint joinPoint) throws Throwable {
	 * Object result = joinPoint.proceed(); System.out.println(result); //Other
	 * return result; }
	 */

}
