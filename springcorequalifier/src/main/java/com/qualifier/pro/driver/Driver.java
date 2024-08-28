package com.qualifier.pro.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qualifier.pro.config.ConfigDb;
import com.qualifier.pro.pojo.DatabaseUtil;



public class Driver {
public static void main(String[] args) {
	ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigDb.class);
	DatabaseUtil db = ac.getBean("d",DatabaseUtil.class);
	db.printDB();
}
}
