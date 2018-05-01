package com.prasad.springtutorials;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public AccountService accountService(){
		AccountServiceImpl bean = new AccountServiceImpl();
		bean.setAccountDao(accountDAO());
		return bean;
	}
	
	@Bean
	public AccountDAO accountDAO(){
		AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
		return bean;
	}
}
