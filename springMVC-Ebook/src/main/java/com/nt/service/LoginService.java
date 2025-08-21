package com.nt.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.LoginDao;
import com.nt.entity.User;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;
	
	//Register Service
	public boolean register(User e) {
//		int ps =(int) Math.random();
//		String password = String.valueOf(ps);
		String password = RandomStringUtils.randomAlphanumeric(8);
		e.setPassword(password);
		return loginDao.register(e);
		
	}

	//Login validate
	public User login(String username, String password) {
		
		return loginDao.login(username,password);
	}

	

}
