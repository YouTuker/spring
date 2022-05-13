package com.yang;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/5/12
 */
public class MySelfBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("调用执行postProcessBeanFactory--MySelfBeanDefinitionRegistryPostProcessor");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("调用执行 postProcessBeanDefinitionRegistry---MySelfBeanDefinitionRegistryPostProcessor");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
