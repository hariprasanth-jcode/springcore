package com.qualifier.prc.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
public class Square implements Shape {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("It has 4 side");
	}

}
