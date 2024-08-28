package com.jspider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value="30")
int id;
public void bunk() {
	System.out.println("Bunk");
}
}
