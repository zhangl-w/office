package com.neusoft.office.kq.service;

import java.util.List;

import com.neusoft.office.kq.po.QjUser;

public interface QjService {
	public List<QjUser> findAll(QjUser user);//局长查询所有
	public void insert(QjUser user);//科员请假
	public List<QjUser> dbAll();//科长代办任务
    public List<QjUser> zjAll();//科员考勤结果
    public void update(QjUser dept);//办理业务科长
    public void kzinsert(QjUser user);//科长请假
    public List<QjUser> jzdbAll();//局长代办
	public List<QjUser> kzjgAll();//科长请假结果
	public void jupdate(QjUser dept);//局长 办理业务
	public void ktupdate(QjUser dept);//科长提交
	public void kzbh(QjUser dept);//科长驳回
	public void jzbh(QjUser dept);//局长驳回
	public void jzbhyy(QjUser dept);//局长驳回原因

}
