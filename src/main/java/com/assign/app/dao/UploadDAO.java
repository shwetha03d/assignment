package com.assign.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UploadDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public UploadDAO() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}
	
	public String uploadDAO() {
		return null;
		
	}

}
