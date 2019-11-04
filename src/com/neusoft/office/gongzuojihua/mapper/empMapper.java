package com.neusoft.office.gongzuojihua.mapper;

import java.util.List;

import com.neusoft.office.gongzuojihua.po.empvo;
import com.neusoft.office.gongzuojihua.po.epdvo;
import com.neusoft.office.gongzuojihua.po.Plan;

public interface empMapper {
	 List<empvo> all(int id);
	 
	 List<empvo> Start(int id);

	void inertplan(Plan p);

	List<empvo> selectplan(int id);

	List<empvo> selectyear(empvo vo);

	void updateplan(empvo vo);

	List<epdvo> selectmsg(int id);
	
	void deleteplan(String only);

	// ×îÖÕÕûºÏ
	void curd(Plan p);
	
    List<empvo> SelectFile(int id);

	List<empvo> File(int id);

	String process(int only);

	List<String> Reject(int only);

	List<String> carall();
}
