package com.resolveBeforeInstantiation;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/5/31
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	public MyInstantiationAwareBeanPostProcessor(){
		System.out.println("初始化 MyInstantiationAwareBeanPostProcessor ");
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("beanName:"+beanName+"---执行 postProcessBeforeInitialization 方法---");
		return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("beanName:"+beanName+"---执行 postProcessAfterInitialization 方法---");
		return InstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("beanName:"+beanName+"---执行 postProcessBeforeInstantiation 方法---");
		if (beanClass == BeforeInstantiation.class) {
			Enhancer enhancer = new Enhancer();

			enhancer.setSuperclass(beanClass);
			enhancer.setCallback(new MyMethodInterceptor());

			BeforeInstantiation instantiation = (BeforeInstantiation) enhancer.create();
			System.out.println("创建代理对象："+instantiation);

			return instantiation;

		}

		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("beanName:"+beanName+"---执行 postProcessAfterInstantiation 方法---");
		return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
	}


	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("beanName:"+beanName+"---执行 postProcessProperties 方法---");
		return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
	}

}
