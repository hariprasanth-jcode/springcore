package com.qualifier.prc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="db")
public class DataBaseUtil {
    @Autowired
    @Qualifier(value="oracledb")
	DataBaseUser database;
	public void printdb() {
		database.dataBaseToBeUsed();
	}
}
