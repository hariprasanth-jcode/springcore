package com.jspider.prc.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.jspider.prc.pojo.Shape;
@Primary
@Component
public class Square implements Shape {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("It has 4 side");
	}

}
