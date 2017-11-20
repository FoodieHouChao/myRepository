package com.itheima.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		System.out.println("=====ServletInitializer======");
		/** 设置Application类 */
		builder.sources(Application.class);
		/** 设置横幅模式: 关闭 */
		builder.bannerMode(Mode.OFF);
		return builder;
	}
}
