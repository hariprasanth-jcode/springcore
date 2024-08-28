package com.jspider.prc.driver;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.prc.config.ClassConfig;
import com.jspider.prc.pojo.Person;

public class Driver {
public static void main(String[] args) {
ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(ClassConfig.class);
Person person = applicationcontext.getBean("person",Person.class);
System.out.println(person.getMobile().getNumber());
System.out.println(applicationcontext);
//ArrayList ac = applicationcontext.getBean("arraylist",ArrayList.class);
//System.out.println(ac.size());

}
}
