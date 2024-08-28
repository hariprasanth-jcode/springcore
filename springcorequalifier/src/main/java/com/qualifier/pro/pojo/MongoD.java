package com.qualifier.pro.pojo;

import org.springframework.stereotype.Component;

@Component
public class MongoD implements DatabaseUsage{

	@Override
	public void dataBaseToBeUsed() {
		// TODO Auto-generated method stub
		System.out.println("MongoDb");
		
	}

}
