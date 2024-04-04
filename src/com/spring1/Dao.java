package com.spring1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dao {

	@Autowired
	private DataSource ds;
	
	public void savedata(student s) {
		try {
			Connection c=ds.getConnection();
			PreparedStatement st=c.prepareStatement("insert into spring.student values (?,?,?,?)");
			st.setInt(1, s.getSid());
			st.setString(2, s.getSname());
			st.setInt(3, s.getSage());
			st.setString(4, s.getSqual());
			st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getbyId(int student) {
		try {
			Connection c=ds.getConnection();
			PreparedStatement st=c.prepareStatement("select * from spring.student where sid =?");
			st.setInt(1, student);		
			
		ResultSet rs=	st.executeQuery();
		if (rs.next()) {
			student std = new student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
			System.out.println(std);
			
		}else {
			System.out.println("not threre");
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deletebyId(int i) {
		try {
			Connection c=ds.getConnection();
			PreparedStatement st=c.prepareStatement("delete from spring.student where sid =?");
			st.setInt(1, i);		
			
		boolean rs=	st.execute();
		System.out.println(rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updatebyId(student s) {
		try {
			Connection c=ds.getConnection();
			PreparedStatement st=c.prepareStatement("update spring.student set sname=?, sage=?, squal=? where sid=?");
			st.setInt(4, s.getSid());
			st.setString(1, s.getSname());
			st.setInt(2, s.getSage());
			st.setString(3, s.getSqual());
			st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void getall() {
		try {
			Connection c=ds.getConnection();
			PreparedStatement st=c.prepareStatement("select * from spring.student");
			
		ResultSet rs=	st.executeQuery();
			while(rs.next()) {
		
			student std = new student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
			System.out.println(std);
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
