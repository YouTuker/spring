package com.yang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author yangchuantang
 * @email uct20210715@163.com
 * @date 2022/5/13
 */
@Component
@Configuration
@PropertySource({"classpath:aliyun.properties"})
public class config {
	static {

		System.out.println("config初始化");
	}

	@Value("${spring.name}")
	private String name;

	@Component
	@Configuration
	class innerClass{


		@Component
		@Configuration
		class innerinnerClass{

		}

	}
}
