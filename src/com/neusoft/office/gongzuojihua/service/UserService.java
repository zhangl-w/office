package com.neusoft.office.gongzuojihua.service;

import java.util.List;

import com.neusoft.office.gongzuojihua.po.All;
import com.neusoft.office.gongzuojihua.po.User;
import com.neusoft.office.gongzuojihua.po.Dept;
import com.neusoft.office.gongzuojihua.po.Emp;
import com.neusoft.office.gongzuojihua.po.Plan;


public interface UserService {
	public List<User> all();
	public List<Emp> selectEmp();
	public List<Dept> getDept();
	public List<Plan> getPlan();
	public List<All> getAll();
	public List<All> runWork();
	public List<All> endWork();
	public List<All> waitWork();
	public void fabu(int n);
	public void shangbao(All all);
	public void shenhea(All all);
	public List<All> selectFB();
	public void addIdea(All all);
	public void jshenhe(All all);
	public List<All> jwaitWork();
}
