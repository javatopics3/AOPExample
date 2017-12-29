package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.module.Student;
import com.one.Rectangle;
import com.one.three.Shape;
import com.one.two.Circle;
import com.one.two.Design;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");

		Employee e = context.getBean("emp", Employee.class);
		Student std = context.getBean("std", Student.class);
		Shape s1 = context.getBean("s1", Shape.class);
		Circle c1 = context.getBean("c1", Circle.class);
		Rectangle r1 = context.getBean("r1", Rectangle.class);
		Design d1 = context.getBean("d1", Design.class);

		// (* com.one.Rectangle.get*())

		c1.getName(10);
		d1.getName(20);
		d1.getName();
		c1.getName();

		r1.getName();
		r1.getType();
		r1.getName(10);
		r1.getType(10);

	}
}
