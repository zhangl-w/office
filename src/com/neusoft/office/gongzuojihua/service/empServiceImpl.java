package com.neusoft.office.gongzuojihua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.office.gongzuojihua.mapper.empMapper;
import com.neusoft.office.gongzuojihua.po.empvo;
import com.neusoft.office.gongzuojihua.po.epdvo;
import com.neusoft.office.gongzuojihua.po.Plan;

@Service("empService")
public class empServiceImpl implements empService{
	@Autowired
	private empMapper empMapper;

	@Override
	public List<empvo> all(int id) {
		return empMapper.all(id);
	}

	@Override
	public List<empvo> Start(int id) {
		// TODO Auto-generated method stub
		return empMapper.Start(id);
	}

	@Override
	public void inertplan(Plan p) {
		// TODO Auto-generated method stub
		empMapper.inertplan(p);
	}

	@Override
	public List<empvo> selectplan(int id) {
		// TODO Auto-generated method stub
		return empMapper.selectplan(id);
	}



	@Override
	public List<empvo> selectyear(empvo vo) {
		// TODO Auto-generated method stub
		
		return empMapper.selectyear(vo);
	}

	@Override
	public void updateplan(empvo vo) {
		// TODO Auto-generated method stub
		empMapper.updateplan(vo);
	}

	@Override
	public List<epdvo> selectmsg(int id) {
		// TODO Auto-generated method stub
		return empMapper.selectmsg(id);
	}

	@Override
	public void deleteplan(String only) {
		// TODO Auto-generated method stub
		empMapper.deleteplan(only);
	}


	@Override
	public List<empvo> SelectFile(int id) {
		// TODO Auto-generated method stub
		return empMapper.SelectFile(id);
	}

	@Override
	public List<empvo> File(int id) {
		// TODO Auto-generated method stub
		return  empMapper.File(id);
	}

	@Override
	public void curd(Plan p) {
		// TODO Auto-generated method stub
		 empMapper.curd(p);
	}

	@Override
	public String process(int only) {
		// TODO Auto-generated method stub
		return  empMapper.process(only);
	}

	@Override
	public List<String> Reject(int only) {
		// TODO Auto-generated method stub
		return  empMapper.Reject(only);
	}

	@Override
	public List<String> carall() {
		// TODO Auto-generated method stub
		return empMapper.carall();
	}



}
