package com.jspider.prc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
private int age;

private Mobile mobile;
public Mobile getMobile() {
	return mobile;
}

public void setMobile(Mobile mobile) {
	this.mobile = mobile;
}
@Autowired
public Person(Mobile mobile) {
	
	this.mobile = mobile;
}
public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

}
