package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main1(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.savedata(new student(21, "dscc", 88, "ms"));
		
	}
	public static void main2(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.getbyId(12);
		
	}
	public static void main3(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.deletebyId(4);
		
	}
	public static void main4(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.updatebyid(new student(18, " ccc", 60, "mtech"));
		
	}
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.getall();
		
	}
}
