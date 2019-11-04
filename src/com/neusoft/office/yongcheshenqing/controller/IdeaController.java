package com.neusoft.office.yongcheshenqing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.neusoft.office.yongcheshenqing.po.Car;
import com.neusoft.office.yongcheshenqing.po.Carrequest;
import com.neusoft.office.yongcheshenqing.po.Idea;
import com.neusoft.office.yongcheshenqing.service.CarService;
import com.neusoft.office.yongcheshenqing.service.IdeaService;

@CrossOrigin(origins = "*",maxAge = 3600)
@Controller
@RequestMapping("/idea")
public class IdeaController {
	
	@Autowired
	private IdeaService ideaService;
	

	@RequestMapping(value = "/ideaAdd.a",method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String ideaAdd(Idea i){
		System.out.println(1);
		if (i!=null) {
			ideaService.addIdea(i);
			return "1";
		} else {
			return "0";
		}
	}
	@RequestMapping(value = "/findById.a",method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String findById(int requestid){
		List<Idea> list = ideaService.findById(requestid); 
		System.out.println(list);
		Gson a = new Gson();
		System.out.println(a.toJson(list));
		return a.toJson(list);
	}
}
