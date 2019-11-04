package com.neusoft.office.yongcheshenqing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.office.yongcheshenqing.mapper.CarrequestMapper;
import com.neusoft.office.yongcheshenqing.po.Car;
import com.neusoft.office.yongcheshenqing.po.Carrequest;
@Service
public class CarrequestServiceImpl implements CarrequestService{
	@Autowired
	private CarrequestMapper CarrequestMapper;

	@Override
	public List<Carrequest> findInfo() {
		// TODO Auto-generated method stub
		List<Carrequest> list = CarrequestMapper.findInfo();
		System.out.println(list);
		return list;
	}

	@Override
	public List<Carrequest> findAll() {
		// TODO Auto-generated method stub
		List<Carrequest> list = CarrequestMapper.findAll();
		return list;
	}

	

	@Override
	public void carrequestadd(Carrequest c) {
		// TODO Auto-generated method stub
		CarrequestMapper.carrequestadd(c);
	}

	@Override
	public List<Carrequest> findMy() {
		// TODO Auto-generated method stub
		List<Carrequest> list = CarrequestMapper.findMy();
		return list;
	}

	@Override
	public Carrequest findById(int id) {
		// TODO Auto-generated method stub
		Carrequest c = CarrequestMapper.findById(id);
		return c;
	}

	@Override
	public void up(Carrequest c) {
		// TODO Auto-generated method stub
		CarrequestMapper.up(c);
	}

	@Override
	public void del(Carrequest c) {
		// TODO Auto-generated method stub
		CarrequestMapper.del(c);
	}

	@Override
	public List<Carrequest> findshenhe1() {
		// TODO Auto-generated method stub
		List<Carrequest> list = CarrequestMapper.findshenhe1();
		return list;
	}

	@Override
	public void shenheup1(Carrequest c) {
		// TODO Auto-generated method stub
		CarrequestMapper.shenheup1(c);
	}

	@Override
	public List<Carrequest> findshenhe2() {
		// TODO Auto-generated method stub
		List<Carrequest> list = CarrequestMapper.findshenhe2();
		return list;
	}

	@Override
	public void shenheup2(Carrequest c) {
		// TODO Auto-generated method stub
		CarrequestMapper.shenheup2(c);
	}

	@Override
	public void guidang(Carrequest c) {
		// TODO Auto-generated method stub
		CarrequestMapper.guidang(c);
	}

	@Override
	public List<Carrequest> findguidang() {
		// TODO Auto-generated method stub
		List<Carrequest> list = CarrequestMapper.findguidang();
		return list;
	}

	@Override
	public void wancheng(Carrequest c) {
		// TODO Auto-generated method stub
		CarrequestMapper.wancheng(c);
	}

	@Override
	public List<Carrequest> deptlist() {
		// TODO Auto-generated method stub
		List<Carrequest> list = CarrequestMapper.deptlist();
		return list;
	}

	
	

	

	

}
