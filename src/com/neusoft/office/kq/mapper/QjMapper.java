package com.neusoft.office.kq.mapper;

import java.util.List;

import com.neusoft.office.kq.po.QjUser;

public interface QjMapper {
	public List<QjUser> findAll(QjUser user);//局长查询
	public void save(QjUser user);//添加
	public void update(QjUser dept);//办理通过
	public List<QjUser> dbAll();//代办
	public List<QjUser> zjAll();//自己结果
	public List<QjUser> jgAll();//
	public void kzsave(QjUser user);//科长请假
	public List<QjUser>jzdbAll();//局长代办
	public List<QjUser>kzjgAll();//科长请假结果
	public void jupdate(QjUser dete);//局长办理任务
	public void ktupdate(QjUser dept);//科长提交
	public void kzbh(QjUser dept);//科长驳回
	public void jzbh(QjUser dept);//局长驳回
	public void jzbhyy(QjUser dept);//局长驳回原因
}
