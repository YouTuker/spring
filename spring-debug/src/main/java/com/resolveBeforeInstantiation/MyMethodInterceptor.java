package com.resolveBeforeInstantiation;


import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/5/31
 */
public class MyMethodInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("目标方法执行之前："+ method);
		Object o1 = methodProxy.invokeSuper(o, objects);

		System.out.println("目标方法执行之后："+ method);
		return o1;
	}
}
