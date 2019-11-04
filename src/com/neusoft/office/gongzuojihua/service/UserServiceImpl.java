package com.neusoft.office.gongzuojihua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.office.gongzuojihua.mapper.UserMapper;
import com.neusoft.office.gongzuojihua.po.All;
import com.neusoft.office.gongzuojihua.po.User;
import com.neusoft.office.gongzuojihua.po.Dept;
import com.neusoft.office.gongzuojihua.po.Emp;
import com.neusoft.office.gongzuojihua.po.Plan;


@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> all() {
		// TODO Auto-generated method stub
		
		return userMapper.all();
	}

	@Override
	public List<Emp> selectEmp() {
		// TODO Auto-generated method stub
		return userMapper.selectEmp();
	}

	@Override
	public List<Dept> getDept() {
		// TODO Auto-generated method stub
		return userMapper.getDept();
	}

	@Override
	public List<Plan> getPlan() {
		// TODO Auto-generated method stub
		return userMapper.getPlan();
	}

	@Override
	public List<All> getAll() {
		// TODO Auto-generated method stub
		return userMapper.getAll();
	}

	@Override
	public List<All> runWork() {
		// TODO Auto-generated method stub
		return userMapper.runWork();
	}

	@Override
	public List<All> endWork() {
		// TODO Auto-generated method stub
		return userMapper.endWork();
	}

	@Override
	public List<All> waitWork() {
		// TODO Auto-generated method stub
		return userMapper.waitWork();
	}

	@Override
	public void fabu(int n) {
		// TODO Auto-generated method stub
		userMapper.fabu(n);
	}


	@Override
	public void shangbao(All all) {
		// TODO Auto-generated method stub
		userMapper.shangbao(all);
	}

	@Override
	public void shenhea(All all) {
		// TODO Auto-generated method stub
		userMapper.shenhea(all);
	}

	@Override
	public List<All> selectFB() {
		// TODO Auto-generated method stub
		return userMapper.selectFB();
	}

	@Override
	public void addIdea(All all) {
		// TODO Auto-generated method stub
		userMapper.addIdea(all);
	}

	@Override
	public void jshenhe(All all) {
		// TODO Auto-generated method stub
		userMapper.jshenhe(all);
	}

	@Override
	public List<All> jwaitWork() {
		// TODO Auto-generated method stub
		return userMapper.jwaitWork();
	}

}
