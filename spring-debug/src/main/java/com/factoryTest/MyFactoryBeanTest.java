package com.factoryTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/6/4
 */
public class MyFactoryBeanTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("myFactoryBeanTest.xml");

	}
}
