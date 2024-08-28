package com.qualifier.pro.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MongoDb implements DataBaseUser{

	@Override
	public void dataBaseToBeUsed() {
		// TODO Auto-generated method stub
		System.out.println("MongoDb");
	}

}
