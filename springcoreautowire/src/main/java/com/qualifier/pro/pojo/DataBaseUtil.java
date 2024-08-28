package com.qualifier.pro.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="db")
public class DataBaseUtil {

@Autowired
@Qualifier
DataBaseUser databaseuser;

public void printDb() {
	databaseuser.dataBaseToBeUsed();
}
}
