package com.risk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.risk.dao.logindao;
import com.risk.model.Login;
import com.risk.service.loginservice;


@Service("loginservice")
@Transactional
public class loginserviceimpl implements loginservice {
	
	@Autowired
	logindao logindaoobj;

	public void setLogindaoobj(logindao logindaoobj) {
		this.logindaoobj = logindaoobj;
	}

	@Override
	public boolean checkLogin(String email, String password) {
		
		return logindaoobj.checkLogin(email, password);
	}

	
	/*
	 * public List<Login> getlogindetails() { return logindaoobj.getlogindetails();
	 * }
	 * 
	 * 
	 * public void savelogindata(Login login) { logindaoobj.savelogindata(login);
	 * 
	 * }
	 */

}
