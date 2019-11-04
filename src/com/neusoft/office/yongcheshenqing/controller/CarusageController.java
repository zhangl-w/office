package com.neusoft.office.yongcheshenqing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.neusoft.office.yongcheshenqing.po.Carrequest;
import com.neusoft.office.yongcheshenqing.service.CarrequestService;
@CrossOrigin(origins = "*",maxAge = 3600)
	@Controller
	@RequestMapping("/carrequest")
public class CarusageController {
	
	
		@Autowired
		private CarrequestService carrequestService;
		
		@RequestMapping(value = "/carrequest.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String findInfo(){
			List<Carrequest> list = carrequestService.findInfo();
			

			 System.out.println(list);
			Gson a = new Gson();
//			String json = JSON.toJSONString(list);
			System.out.println(a.toJson(list));
			
			return a.toJson(list);
		}
		@RequestMapping(value = "/findAll.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String findAll(){
			List<Carrequest> list = carrequestService.findAll();
			System.out.println(list);
			Gson a = new Gson();
			System.out.println(a.toJson(list));
			return a.toJson(list);
		}
		
	
		@RequestMapping(value = "/request.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String carrequestadd(Carrequest c){
			System.out.println(1);
			if (c!=null) {
				carrequestService.carrequestadd(c);
				return "1";
			} else {
				return "0";
			}
		}
		@RequestMapping(value = "/findMy.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String findMy(){
			List<Carrequest> list = carrequestService.findMy();
			System.out.println(list);
			Gson a = new Gson();
			System.out.println(a.toJson(list));
			return a.toJson(list);
		}
		@RequestMapping(value = "/findById.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String findById(int id){
			Carrequest c = carrequestService.findById(id); 
			System.out.println(c);
			Gson a = new Gson();
			System.out.println(a.toJson(c));
			return a.toJson(c);
		}
		@RequestMapping(value = "/up.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String up(Carrequest c){
			carrequestService.up(c);
			
			return "1";
		}
		@RequestMapping(value = "/del.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String del(Carrequest c){
			carrequestService.del(c);
			
			return "1";
		}
		@RequestMapping(value = "/findshenhe1.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String findshenhe1(){
			List<Carrequest> list = carrequestService.findshenhe1();
			System.out.println(list);
			Gson a = new Gson();
			System.out.println(a.toJson(list));
			return a.toJson(list);
		}
		@RequestMapping(value = "/shenheup1.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String shenheup1(Carrequest c){
			carrequestService.shenheup1(c);
			
			return "1";
		}
		@RequestMapping(value = "/findshenhe2.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String findshenhe2(){
			List<Carrequest> list = carrequestService.findshenhe2();
			System.out.println(list);
			Gson a = new Gson();
			System.out.println(a.toJson(list));
			return a.toJson(list);
		}
		@RequestMapping(value = "/shenheup2.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String shenheup2(Carrequest c){
			carrequestService.shenheup2(c); 
			
			return "1";
		}
		@RequestMapping(value = "/guidang.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String guidang(Carrequest c){
			carrequestService.guidang(c);  
			
			return "1";
		}
		@RequestMapping(value = "/findguidang.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String findguidang(){
			List<Carrequest> list = carrequestService.findguidang();
			System.out.println(list);
			Gson a = new Gson();
			System.out.println(a.toJson(list));
			return a.toJson(list);
		}
		@RequestMapping(value = "/wancheng.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String wancheng(Carrequest c){
			carrequestService.wancheng(c);
			
			return "1";
		}
		@RequestMapping(value = "/deptlist.a",method = {RequestMethod.GET,RequestMethod.POST})
		@ResponseBody
		public String deptlist(){
			List<Carrequest> list = carrequestService.deptlist();
			System.out.println(list);
			Gson a = new Gson();
			System.out.println(a.toJson(list));
			return a.toJson(list);
		}
}