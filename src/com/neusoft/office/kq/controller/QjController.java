package com.neusoft.office.kq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.google.gson.Gson;
import com.neusoft.office.kq.po.QjUser;
import com.neusoft.office.kq.service.QjService;
@CrossOrigin(origins = "*",maxAge= 3600)
@Controller
@RequestMapping("/qjUser")
public class QjController {
	@Autowired
	private QjService qjService;
	@RequestMapping(value ="/findAll.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String findAll(QjUser user){
		List<QjUser> list = qjService.findAll(user);
		System.out.println(list);
		Gson g =  new Gson();
		String s = g.toJson(list);
		return s;
	}
	@RequestMapping(value="/insert.a",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String insert(QjUser user){
		//String s =new String();
       
        	qjService.insert(user);
           System.out.println(user); 
     
    
        return "success";

    }
	@RequestMapping(value ="/dbAll.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String dbAll(){
		List<QjUser> list = qjService.dbAll( );
		System.out.println(list);
		Gson g =  new Gson();
		String s = g.toJson(list);
		return s;
	}
	@RequestMapping(value ="/zjAll.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String zjAll(){
		List<QjUser> list = qjService.zjAll( );
		//System.out.println(list);
		Gson g =  new Gson();
		String s = g.toJson(list);
		return s;
	}
	@RequestMapping(value="/kzinsert.a",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String kzinsert(QjUser user){
		
       
        	qjService.kzinsert(user);
           System.out.println(user); 
       
    
        return "success";

    }
	@RequestMapping(value ="/jzdbAll.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String  jzdbAll(){
		List<QjUser> list = qjService.jzdbAll( );
		//System.out.println(list);
		Gson g =  new Gson();
		String s = g.toJson(list);
		return s;
	}
	@RequestMapping(value ="/kzjgAll.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String kzjgAll(){
		List<QjUser> list = qjService.kzjgAll( );
		//System.out.println(list);
		Gson g =  new Gson();
		String s = g.toJson(list);
		return s;
	}
	@RequestMapping(value="/update.a",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public void update(QjUser dept){
		
		qjService.update(dept);
		//System.out.println(dept);
    
    }
	@RequestMapping(value="/jupdate.a",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public void jupdate(QjUser dept){
		
		qjService.jupdate(dept);
		//System.out.println(dept);
    
    }
	
	@RequestMapping(value="/ktupdate.a",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public void ktupdate(QjUser dept){
		
		qjService.ktupdate(dept);
		//System.out.println(dept);
	}
	@RequestMapping(value="/kzbh.a",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public void kzbh(QjUser dept){
		
		qjService.kzbh(dept);
		//System.out.println(dept);
	}
	@RequestMapping(value="/jzbh.a",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public void jzbh(QjUser dept){
		
		qjService.jzbh(dept);
		//System.out.println(dept);
	}
	@RequestMapping(value="/jzbhyy.a",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public void jzbhyy(QjUser dept){
		
		qjService.jzbhyy(dept);
		//System.out.println(dept);
	}
}
