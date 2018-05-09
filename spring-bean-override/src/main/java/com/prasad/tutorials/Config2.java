package com.prasad.tutorials;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {

	@Bean
	public Foo foo(){
		Foo foo = new Foo();
		foo.setName("Your Foo");
		return foo;
	}
}
