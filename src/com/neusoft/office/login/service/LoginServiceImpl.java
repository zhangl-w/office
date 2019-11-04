package com.neusoft.office.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.office.login.mapper.LoginMapper;
import com.neusoft.office.login.po.User;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginMapper loginMapper;

	@Override
	public List<User> login(User u) {
		// TODO Auto-generated method stub
		
		return loginMapper.login(u);
	}

	

	

}
