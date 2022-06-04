package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/6/3
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("person.xml");
		Person bean = ac.getBean(Person.class);
		Person bean2 = ac.getBean(Person.class);
	}
}
