package com.neusoft.office.kq.service;

import java.util.List;

import com.neusoft.office.kq.po.QjUser;

public interface QjService {
	public List<QjUser> findAll(QjUser user);//�ֳ���ѯ����
	public void insert(QjUser user);//��Ա���
	public List<QjUser> dbAll();//�Ƴ���������
    public List<QjUser> zjAll();//��Ա���ڽ��
    public void update(QjUser dept);//����ҵ��Ƴ�
    public void kzinsert(QjUser user);//�Ƴ����
    public List<QjUser> jzdbAll();//�ֳ�����
	public List<QjUser> kzjgAll();//�Ƴ���ٽ��
	public void jupdate(QjUser dept);//�ֳ� ����ҵ��
	public void ktupdate(QjUser dept);//�Ƴ��ύ
	public void kzbh(QjUser dept);//�Ƴ�����
	public void jzbh(QjUser dept);//�ֳ�����
	public void jzbhyy(QjUser dept);//�ֳ�����ԭ��

}
