package com.arano.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class SpringUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		SpringUtil.applicationContext = applicationContext;
	}


	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}


	public static <T> T getBean(String name) {
		return (T) applicationContext.getBean(name);
	}


	public static <T> T getBean(Class<T> clazz) {
		return applicationContext.getBean(clazz);
	}

}




