package com.neusoft.office.yongcheshenqing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.office.yongcheshenqing.mapper.CarMapper;
import com.neusoft.office.yongcheshenqing.mapper.IdeaMapper;
import com.neusoft.office.yongcheshenqing.po.Carrequest;
import com.neusoft.office.yongcheshenqing.po.Idea;

@Service
public class IdeaServiceImpl implements IdeaService{

	@Autowired
	private IdeaMapper ideaMapper;

	@Override
	public void addIdea(Idea i) {
		// TODO Auto-generated method stub
		ideaMapper.addIdea(i);
	}

	@Override
	public List<Idea> findById(int requestid) {
		// TODO Auto-generated method stub
		List<Idea> list = ideaMapper.findById(requestid);
		return list;
	}
}
