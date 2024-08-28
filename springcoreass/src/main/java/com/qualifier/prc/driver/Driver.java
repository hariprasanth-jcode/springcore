package com.qualifier.prc.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qualifier.prc.config.ConfigClass;
import com.qualifier.prc.pojo.DataBaseUtil;

public class Driver {
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigClass.class);
	DataBaseUtil db = ac.getBean("db",DataBaseUtil.class);
	//db.printdb();
}
}
