package com.jspider.prc.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jspider.prc")
public class ClassConfig {
   @Bean
	public ArrayList getArrayList() {
		return new ArrayList();
	}
}
