package com.prasad.tutorials;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//AnnotationConfigApplicationContext applicaitonContext = new AnnotationConfigApplicationContext(Config1.class,Config2.class);
		AnnotationConfigApplicationContext applicaitonContext = new AnnotationConfigApplicationContext(Config2.class,Config1.class); // changed order
		
		Foo foo = applicaitonContext.getBean(Foo.class);
		System.out.println(foo.getName());

	}

}
