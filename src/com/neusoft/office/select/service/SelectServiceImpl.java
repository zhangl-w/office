package com.neusoft.office.select.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.office.select.mapper.SelectMapper;
import com.neusoft.office.select.po.Bangong;
import com.neusoft.office.select.po.Chuqinbiao;
import com.neusoft.office.select.po.Pingjia;
import com.neusoft.office.select.po.Qingjia;
import com.neusoft.office.select.po.User;

@Service("selectService")
public class SelectServiceImpl implements SelectService{
	@Autowired
	private SelectMapper selectMapper;

	@Override
	public String all() {
		// TODO Auto-generated method stub
		
		return selectMapper.all();
	}

	@Override
	public String select(Bangong b) {
		// TODO Auto-generated method stub
		
		return selectMapper.select(b);
	}

	@Override
	public String end(Bangong b) {
		// TODO Auto-generated method stub
		return selectMapper.end(b);
	}
	
	@Override
	public String person(Bangong b) {
		// TODO Auto-generated method stub
		return selectMapper.person(b);
	}

	@Override
	public String star(Bangong b) {
		// TODO Auto-generated method stub
		return selectMapper.star(b);
	}

	@Override
	public String chuqin(Qingjia c) {
		// TODO Auto-generated method stub
		return selectMapper.chuqin(c);
	}

	@Override
	public String juzhang() {
		// TODO Auto-generated method stub
		return selectMapper.juzhang();
	}

	@Override
	public String shijia(String d) {
		// TODO Auto-generated method stub
		return selectMapper.shijia(d);
	}

	@Override
	public String bingjia(String kaishishijian) {
		// TODO Auto-generated method stub
		return selectMapper.bingjia(kaishishijian);
	}

	@Override
	public String qitajia(String kaishishijian) {
		// TODO Auto-generated method stub
		return selectMapper.qitajia(kaishishijian);
	}

	@Override
	public List<Qingjia> shijiaperson(String kaishishijian) {
		// TODO Auto-generated method stub
		return selectMapper.shijiaperson(kaishishijian);
	}

	@Override
	public List<Qingjia> bingjiaperson(String kaishishijian) {
		// TODO Auto-generated method stub
		return selectMapper.bingjiaperson(kaishishijian);
	}

	@Override
	public List<Qingjia> qitajiaperson(String kaishishijian) {
		// TODO Auto-generated method stub
		return selectMapper.qitajiaperson(kaishishijian);
	}

	@Override
	public List<Pingjia> z(Bangong b) {
		// TODO Auto-generated method stub
		return selectMapper.z(b);
	}

	@Override
	public String chuchai(Qingjia q) {
		// TODO Auto-generated method stub
		return selectMapper.chuchai(q);
	}

	@Override
	public List<Qingjia> chuchaiday(Qingjia q) {
		// TODO Auto-generated method stub
		return selectMapper.chuchaiday(q);
	}





}
