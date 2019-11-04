package com.neusoft.office.login.service;

import java.util.List;

import com.neusoft.office.login.po.User;

public interface LoginService {
	public List<User> login(User u);
}
