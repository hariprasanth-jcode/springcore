package com.qualifier.prc.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qualifier.prc.config.ConfigShape;
import com.qualifier.prc.pojo.ShapeApp;


public class Driver1 {
public static void main(String[] args) {
	ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigShape.class);
	ShapeApp sa=ac.getBean("s",ShapeApp.class);
	sa.printShape();
	

}
}
