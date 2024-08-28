package com.jspider.prc.pojo;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	@Override
	public void print() {
		// TODO Auto-generated method stub
	System.out.println("It has 3 sides");	
	}

}
