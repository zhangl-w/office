package com.neusoft.office.yongcheshenqing.service;

import java.util.List;

import com.neusoft.office.yongcheshenqing.po.Carrequest;

public interface CarrequestService {
	List<Carrequest> findInfo();
	List<Carrequest> findAll();

	void carrequestadd(Carrequest c);
	List<Carrequest> findMy();
	Carrequest findById(int id);
	void up(Carrequest c);
	void del(Carrequest c);
	List<Carrequest> findshenhe1();
	void shenheup1(Carrequest c);
	List<Carrequest> findshenhe2();
	void shenheup2(Carrequest c);
	void guidang(Carrequest c);
	List<Carrequest> findguidang();
	void wancheng(Carrequest c);
	List<Carrequest> deptlist();
	
	
	
}
