package com.neusoft.office.select.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.neusoft.office.select.po.Bangong;
import com.neusoft.office.select.po.Chuqinbiao;
import com.neusoft.office.select.po.Pingjia;
import com.neusoft.office.select.po.Qingjia;
import com.neusoft.office.select.po.User;
import com.neusoft.office.select.service.SelectService;

@CrossOrigin(origins = "*",maxAge = 3600)
@Controller
@RequestMapping("/select")
public class SelcetController {
	@Autowired
	private SelectService selectService;
	

	@RequestMapping(value = "/begin.a")
	@ResponseBody
	public String select(Bangong b){
		System.out.println(b);
		String a =selectService.select(b);
		System.out.println(a);
		Gson s =new Gson();
		return s.toJson(a);
	}
	
	
	
	@RequestMapping(value = "/end.a")
	@ResponseBody
	public String end(Bangong b){
		String a =selectService.end(b);
		System.out.println(a);
		Gson s =new Gson();
		return s.toJson(a);
	}
	

	
	@RequestMapping(value = "/person.a")
	@ResponseBody
	public String person(Bangong b){
		System.out.println(b);
		String a =selectService.person(b);
		System.out.println(a);
		Gson s =new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/star.a")
	@ResponseBody
	public String star(Bangong b){
		System.out.println(b);
		String a =selectService.star(b);
		System.out.println(a);
		Gson s =new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/all.a")
	@ResponseBody
	public String all(){
		String a =selectService.all();
		System.out.println(a);
		Gson s =new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/chuqin.a")
	@ResponseBody
	public String chuqin(Qingjia c){
		System.out.println(c.getKaishi());
		String a =selectService.chuqin(c);
		System.out.println(a);
		Gson s =new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/juzhang.a")
	@ResponseBody
	public String juzhang(){
		String a =selectService.juzhang();
		System.out.println(a);
		Gson s =new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/shijia.a")
	@ResponseBody
	public String shijia(String kaishi){
		String a =selectService.shijia(kaishi);
		System.out.println(a);
		Gson s =new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/bingjia.a")
	@ResponseBody
	public String bingjia(String kaishi){
		String a =selectService.bingjia(kaishi);
		System.out.println(a);
		Gson s =new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/qitajia.a")
	@ResponseBody
	public String qitajia(String kaishi){
		System.out.println(kaishi);
		String a =selectService.qitajia(kaishi);
		System.out.println(a);
		Gson s =new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/shijiaperson.a")
	@ResponseBody
	public String shijiaperson(String kaishi){
		System.out.println(kaishi);
		List<Qingjia> a =selectService.shijiaperson(kaishi);
		System.out.println(a);
		Gson s = new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/bingjiaperson.a")
	@ResponseBody
	public String bingjiaperson(String kaishi){
		System.out.println(kaishi);
		List<Qingjia> a =selectService.bingjiaperson(kaishi);
		System.out.println(a);
		Gson s = new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/qitajiaperson.a")
	@ResponseBody
	public String qitajiaperson(String kaishi){
		System.out.println(kaishi);
		List<Qingjia> a =selectService.qitajiaperson(kaishi);
		System.out.println(a);
		Gson s = new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/z.a")
	@ResponseBody
	public String z(Bangong b){
		System.out.println(b);
		List<Pingjia> a =selectService.z(b);
		System.out.println(a);
		Gson s = new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/chuchai.a")
	@ResponseBody
	public String chuchai(Qingjia q){
		System.out.println(q.getKaishi());
		System.out.println(q.getLeixing());
		String a =selectService.chuchai(q);
		System.out.println(a);
		Gson s = new Gson();
		return s.toJson(a);
	}
	
	@RequestMapping(value = "/chuchaiday.a")
	@ResponseBody
	public String chuchaiday(Qingjia q){
		System.out.println(q.getKaishi());
		System.out.println(q.getLeixing());
		List<Qingjia> a =selectService.chuchaiday(q);
		System.out.println(a);
		Gson s = new Gson();
		return s.toJson(a);
	}
	
	
	
	

}
