package com.yang;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/5/7
 */

public class Book {
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
}
