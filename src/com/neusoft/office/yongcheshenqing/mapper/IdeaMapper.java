package com.neusoft.office.yongcheshenqing.mapper;

import java.util.List;

import com.neusoft.office.yongcheshenqing.po.Carrequest;
import com.neusoft.office.yongcheshenqing.po.Idea;

public interface IdeaMapper {
	void addIdea(Idea i);

	List<Idea> findById(int requestid);

}
