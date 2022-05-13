package com.yang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/5/3
 */
public class B {
	public static void main(String[] args) {
		//MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("application.xml");

		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

	}
}
