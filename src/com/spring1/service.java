package com.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class service {

	@Autowired
	private Dao dao;
	
	public void savedata(student s) {
		dao.savedata(s);
	}

	public void getbyId(int student) {
	dao.getbyId(student);
		
	}

	public void deletebyId(int i) {

		dao.deletebyId(i);
		
	}

	public void updatebyId(student student) {
		dao.updatebyId(student);
		
	}

	public void getall() {
		dao.getall();		
	}
}
