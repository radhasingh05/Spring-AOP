package com.radha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class SpringBootAopExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopExampleApplication.class, args);
	}

}
