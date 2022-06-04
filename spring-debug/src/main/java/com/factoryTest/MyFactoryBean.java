package com.factoryTest;

import com.fruit.Apple;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/6/4
 */
public class MyFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new Apple();
	}

	@Override
	public Class<?> getObjectType() {
		return Apple.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
