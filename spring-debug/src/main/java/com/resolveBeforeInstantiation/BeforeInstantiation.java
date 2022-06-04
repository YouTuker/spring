package com.resolveBeforeInstantiation;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/5/31
 */
public class BeforeInstantiation {
	public BeforeInstantiation(){
		System.out.println("初始化 BeforeInstantiation ");
	}

	public void doSomeThing(){
		System.out.println("执行doSomeThing");
	}
}
