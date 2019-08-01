package com.risk.service;

import java.util.List;

import com.risk.model.Login;

public interface loginservice {
	/*
	 * List<Login> getlogindetails(); void savelogindata(Login login);
	 */
	public boolean checkLogin(String email, String password);

}
