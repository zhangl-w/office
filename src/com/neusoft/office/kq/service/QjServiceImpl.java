package com.neusoft.office.kq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.office.kq.mapper.QjMapper;
import com.neusoft.office.kq.po.QjUser;
@Service("qjServiceImpl")
public class QjServiceImpl implements QjService {
    @Autowired
	private QjMapper qjMapper;


	@Override
	public List<QjUser> findAll(QjUser user) {
		// TODO Auto-generated method stub
		return qjMapper.findAll(user);
	}

	@Override
	public void insert(QjUser user) {
		// TODO Auto-generated method stub
		qjMapper.save(user);
	}

	@Override
	public List<QjUser> dbAll() {
		// TODO Auto-generated method stub
		return qjMapper.dbAll();
	}

	@Override
	public List<QjUser> zjAll() {
		// TODO Auto-generated method stub
		return qjMapper.zjAll();
	}

	@Override
	public void update(QjUser dept) {
		// TODO Auto-generated method stub
		qjMapper.update(dept);
	}

	@Override
	public void kzinsert(QjUser user) {
		// TODO Auto-generated method stub
		qjMapper.kzsave(user);
	}

	@Override
	public List<QjUser> jzdbAll() {
		// TODO Auto-generated method stub
		return qjMapper.jzdbAll();
	}

	@Override
	public List<QjUser> kzjgAll() {
		// TODO Auto-generated method stub
		return qjMapper.kzjgAll();
	}

	@Override
	public void jupdate(QjUser dept) {
		// TODO Auto-generated method stub
		qjMapper.jupdate(dept);
	}

	@Override
	public void ktupdate(QjUser dept) {
		// TODO Auto-generated method stub
		qjMapper.ktupdate(dept);
	}

	@Override
	public void kzbh(QjUser dept) {
		// TODO Auto-generated method stub
		qjMapper.kzbh(dept);
	}

	@Override
	public void jzbh(QjUser dept) {
		// TODO Auto-generated method stub
		qjMapper.jzbh(dept);
	}

	@Override
	public void jzbhyy(QjUser dept) {
		// TODO Auto-generated method stub
		qjMapper.jzbhyy(dept);
	}


	

	

	
	

}
