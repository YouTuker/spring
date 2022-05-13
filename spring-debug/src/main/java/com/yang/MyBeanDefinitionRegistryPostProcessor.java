package com.yang;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/5/12
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println(" 执行postProcessBeanFactory ");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("执行 postProcessBeanDefinitionRegistry ");

		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(Book.class);
		builder.addPropertyValue("name","zhangsan");
		registry.registerBeanDefinition("book",new RootBeanDefinition());
	}
}
