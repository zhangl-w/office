package com.neusoft.office.login.mapper;

import java.util.List;

import com.neusoft.office.login.po.User;

public interface LoginMapper {
	public List<User> login(User u);
}
