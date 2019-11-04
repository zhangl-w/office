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
import com.neusoft.office.yongcheshenqing.service.CarService;

@CrossOrigin(origins = "*",maxAge = 3600)
@Controller
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarService carService;
	
	@RequestMapping(value = "/carlist.a",method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String carlist(){
		List<Car> list = carService.findcarlist();
		System.out.println(list);
		Gson a = new Gson();
		System.out.println(a.toJson(list));
		return a.toJson(list);
	}
	@RequestMapping(value = "/findById.a",method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String findById(int carid){
		Car c = carService.findById(carid); 
		System.out.println(c);
		Gson a = new Gson();
		System.out.println(a.toJson(c));
		return a.toJson(c);
	}
	@RequestMapping(value = "/surplusUp.a",method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String surplusUp(Car c){
		 carService.surplusUp(c);
		
		return "1";
	}
}
