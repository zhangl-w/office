package com.neusoft.office.gongzuojihua.service;

import java.util.List;

import com.neusoft.office.gongzuojihua.po.empvo;
import com.neusoft.office.gongzuojihua.po.epdvo;
import com.neusoft.office.gongzuojihua.po.Plan;

public interface empService {
	public List<empvo> all(int id);
	
	public List<empvo> Start(int id);

	public void inertplan(Plan p);

	public List<empvo> selectplan(int id);

	public List<empvo> selectyear(empvo vo);

	public void updateplan(empvo vo);

	public List<epdvo> selectmsg(int id);

	public void deleteplan(String only);

	public List<empvo> SelectFile(int id);

	public List<empvo> File(int id);
	
	public void curd(Plan p);

	public String process(int only);

	public List<String> Reject(int only);

	public List<String> carall();
}
