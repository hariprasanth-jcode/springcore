package com.qualifier.pro.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qualifier.pro.config.ConfigClass;
import com.qualifier.pro.pojo.DataBaseUtil;

public class Driver {
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigClass.class);
	DataBaseUtil dbu = ac.getBean("db",DataBaseUtil.class);
	dbu.printDb();
}
}
