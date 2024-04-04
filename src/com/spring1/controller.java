package com.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class controller {

	@Autowired
	private service service;
	
	public void savedata(student s) {
		service.savedata(s);
	}

	public void getbyId(int student) {
		service.getbyId(student);
		
	}

	public void deletebyId(int i) {
		service.deletebyId(i);
		
	}

	public void updatebyid(student student) {
		service.updatebyId(student);
		
	}

	public void getall() {
		service.getall();
		
	}
}
