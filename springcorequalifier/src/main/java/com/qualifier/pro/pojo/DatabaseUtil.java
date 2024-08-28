package com.qualifier.pro.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="d")
public class DatabaseUtil {
	@Autowired
	@Qualifier(value="mongod")
DatabaseUsage data;
	public void printDB() {
		data.dataBaseToBeUsed();
	}
}
