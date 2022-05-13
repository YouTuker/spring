package com.yang;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/5/4
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocation){
		super(configLocation);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("MyClassPathXmlApplicationContext");
		getEnvironment().setRequiredProperties("username");
	}
}
