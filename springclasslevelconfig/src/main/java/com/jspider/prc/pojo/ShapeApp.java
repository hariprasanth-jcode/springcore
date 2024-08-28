package com.jspider.prc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value="s")
public class ShapeApp {
@Autowired
Shape shape;

public void printShape() {
	shape.print();
}
}
