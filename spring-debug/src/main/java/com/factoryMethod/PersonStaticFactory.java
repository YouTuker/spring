package com.factoryMethod;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/6/3
 */
public class PersonStaticFactory {// 静态工厂

	public static Person getPerson(String name){
		Person person = new Person();
		person.setId(1);
		person.setName(name);
		return person;
	}

}
