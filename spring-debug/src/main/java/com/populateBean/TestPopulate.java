package com.populateBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/6/7
 */
public class TestPopulate {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("populateBean.xml");
	}
}
