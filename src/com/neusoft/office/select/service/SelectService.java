package com.neusoft.office.select.service;

import java.util.List;

import com.neusoft.office.select.po.Bangong;
import com.neusoft.office.select.po.Chuqinbiao;
import com.neusoft.office.select.po.Pingjia;
import com.neusoft.office.select.po.Qingjia;
import com.neusoft.office.select.po.User;

public interface SelectService {
	public String all();

	public String select(Bangong b);
	public String end(Bangong b);
	public String person(Bangong b);

	public String star(Bangong b);

	public String chuqin(Qingjia c);
	
	public String juzhang();

	public String shijia(String kaishishijian);

	public String bingjia(String kaishishijian);

	public String qitajia(String kaishishijian);

	public List<Qingjia> shijiaperson(String kaishishijian);

	public List<Qingjia> bingjiaperson(String kaishishijian);

	public List<Qingjia> qitajiaperson(String kaishishijian);

	public List<Pingjia> z(Bangong b);

	public String chuchai(Qingjia q);

	public List<Qingjia> chuchaiday(Qingjia q);


	
}
