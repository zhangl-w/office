package com.neusoft.office.yongcheshenqing.service;

import java.util.List;

import com.neusoft.office.yongcheshenqing.po.Idea;

public interface IdeaService {
	void addIdea(Idea i);

	List<Idea> findById(int requestid);

}
