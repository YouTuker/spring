package com.yang;

import org.springframework.beans.factory.FactoryBean;

import javax.annotation.PostConstruct;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/5/7
 */

public class Book extends Book0 implements FactoryBean {
	private String name;
	private String id;

	public Book() {
		System.out.println("创建Book对象");
	}

	public Book(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public Object getObject() throws Exception {
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
}
