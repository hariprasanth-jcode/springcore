package com.qualifier.pro.pojo;

import org.springframework.stereotype.Component;

@Component
public class OracleDb implements DataBaseUser{
		@Override
	public void dataBaseToBeUsed() {
		// TODO Auto-generated method stub
		System.out.println("OracleDb");
	}

}
