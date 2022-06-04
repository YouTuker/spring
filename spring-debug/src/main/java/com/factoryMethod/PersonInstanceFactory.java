package com.factoryMethod;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/6/3
 */
public class PersonInstanceFactory {// 实例工厂

	public Person getPerson(String name){
		Person person = new Person();
		person.setId(1);
		person.setName(name);
		return person;
	}
}
