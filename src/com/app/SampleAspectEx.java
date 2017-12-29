package com.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SampleAspectEx {
	@Before("execution(* com.one.*.*.get*(..))")
	public void showMessage() {

		System.out.println("Hello I'm from aspect");
	}

}
