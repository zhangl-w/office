package com.neusoft.office.kq.mapper;

import java.util.List;

import com.neusoft.office.kq.po.QjUser;

public interface QjMapper {
	public List<QjUser> findAll(QjUser user);//�ֳ���ѯ
	public void save(QjUser user);//���
	public void update(QjUser dept);//����ͨ��
	public List<QjUser> dbAll();//����
	public List<QjUser> zjAll();//�Լ����
	public List<QjUser> jgAll();//
	public void kzsave(QjUser user);//�Ƴ����
	public List<QjUser>jzdbAll();//�ֳ�����
	public List<QjUser>kzjgAll();//�Ƴ���ٽ��
	public void jupdate(QjUser dete);//�ֳ���������
	public void ktupdate(QjUser dept);//�Ƴ��ύ
	public void kzbh(QjUser dept);//�Ƴ�����
	public void jzbh(QjUser dept);//�ֳ�����
	public void jzbhyy(QjUser dept);//�ֳ�����ԭ��
}
