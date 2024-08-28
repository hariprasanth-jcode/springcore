package com.qualifier.prc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component(value="s")
public class ShapeApp {
@Autowired
@Qualifier(value="triangle")
Shape shape;

public void printShape() {
	shape.print();
}
}
