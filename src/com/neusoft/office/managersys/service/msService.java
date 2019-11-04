package com.neusoft.office.managersys.service;

import java.util.List;

import com.neusoft.office.managersys.po.Dept;
import com.neusoft.office.managersys.po.Menu;
import com.neusoft.office.managersys.po.function;
import com.neusoft.office.managersys.po.msuser;
import com.neusoft.office.managersys.po.power;
import com.neusoft.office.managersys.po.uc;

public interface msService {
	public List<Dept> getDept();
	public List<msuser> getDeptlist(String dept);
	public List<msuser> getuser();
	public List<msuser> getuserBypower(int power);
	public List<function> getuserFunction(int power);
	public void update(msuser user);
	public List<Menu> getMenu();
	public void update(Dept dept);
	public void del(Dept dept);
	public void userupdate(msuser user);
	public void userdel(Integer uid);
	public List<power> getpower();
	public String getempower(Integer cid);
	public void updateempower(String str1,Integer cid);
	public String getc(Integer cid);
	public List<uc> getuc();
	public List<uc> getid(String cid);
	public List<Menu> getmenu();
	public void uduser(msuser user);
}
