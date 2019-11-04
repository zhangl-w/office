package com.neusoft.office.managersys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.office.managersys.mapper.MsMapper;
import com.neusoft.office.managersys.po.Dept;
import com.neusoft.office.managersys.po.Menu;
import com.neusoft.office.managersys.po.function;
import com.neusoft.office.managersys.po.msuser;
import com.neusoft.office.managersys.po.power;
import com.neusoft.office.managersys.po.uc;

@Service
public class msServiceImpl implements msService{
	@Autowired
	private MsMapper msmapper;

	@Override
	public List<Dept> getDept() {
		// TODO Auto-generated method stub
		return msmapper.getDept();
	}

	@Override
	public List<msuser> getDeptlist(String dept) {
		// TODO Auto-generated method stub
		return msmapper.getDeptlist(dept);
	}

	
	@Override
	public List<function> getuserFunction(int power) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(msuser user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Menu> getMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<msuser> getuserBypower(int power) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		msmapper.update(dept);
	}

	@Override
	public void del(Dept dept) {
		// TODO Auto-generated method stub
		msmapper.del(dept);
	}

	@Override
	public List<msuser> getuser() {
		// TODO Auto-generated method stub
		return msmapper.getuser();
	}

	@Override
	public void userupdate(msuser user) {
		// TODO Auto-generated method stub
		msmapper.userupdate(user);
	}

	@Override
	public void userdel(Integer uid) {
		// TODO Auto-generated method stub
		msmapper.userdel(uid);
	}

	@Override
	public List<power> getpower() {
		// TODO Auto-generated method stub
		return msmapper.getpower();
	}

	@Override
	public String getempower(Integer cid) {
		// TODO Auto-generated method stub
		return msmapper.getempower(cid);
	}

	@Override
	public void updateempower(String str1,Integer cid) {
		// TODO Auto-generated method stub
		msmapper.updateempower(str1,cid);
	}

	@Override
	public String getc(Integer cid) {
		// TODO Auto-generated method stub
		return msmapper.getc(cid);
	}

	@Override
	public List<uc> getuc() {
		// TODO Auto-generated method stub
		return msmapper.getuc();
	}

	@Override
	public List<uc> getid(String cid) {
		// TODO Auto-generated method stub
		return msmapper.getid(cid);
	}

	@Override
	public List<Menu> getmenu() {
		// TODO Auto-generated method stub
		return msmapper.getmenu();
	}

	@Override
	public void uduser(msuser user) {
		// TODO Auto-generated method stub
		msmapper.uduser(user);
	}
}
