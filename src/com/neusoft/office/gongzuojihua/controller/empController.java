package com.neusoft.office.gongzuojihua.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.neusoft.office.gongzuojihua.po.empvo;
import com.neusoft.office.gongzuojihua.po.epdvo;
import com.neusoft.office.gongzuojihua.po.Plan;
import com.neusoft.office.gongzuojihua.service.empService;
import com.neusoft.office.gongzuojihua.util.StrUtil;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/emp")
public class empController {
	@Autowired
	private empService empService;
	// 科员页功能 未完成工作任务
	@RequestMapping("/Nostarted")
	@ResponseBody
	public String Nostarted(int id) {
		return JSON.toJSONString(empService.all(id));
	}
	// 科员页功能 完成工作任务
	@RequestMapping("/start")
	@ResponseBody
	public String Start(int id) {
		return JSON.toJSONString(empService.Start(id));
	}
	// 科员全部工作计划 新建
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(Plan p) {
		empService.inertplan(p);
		return "1";
	}
	// 科员全部工作计划 默认查询
	@RequestMapping("/selectplan.a")
	@ResponseBody
	public String selectplan(int id) {
		// 查询方法暂定
		List<empvo> vo = empService.selectplan(id);
		System.out.println(vo);
		for (empvo empvo : vo) {
			if ("0".equals(empvo.getFlag())) {
				empvo.setFlag("未开始");
			} else if ("1".equals(empvo.getFlag())) {
				empvo.setFlag("已开始");
			} else if ("2".equals(empvo.getFlag())) {
				empvo.setFlag("已完结");
			} else if ("3".equals(empvo.getFlag())) {
				empvo.setFlag("已送审");
			} else if ("4".equals(empvo.getFlag())) {
				empvo.setFlag("科长已驳回");
			} else if ("5".equals(empvo.getFlag())) {
				empvo.setFlag("已归档");
			} else if ("6".equals(empvo.getFlag())) {
				empvo.setFlag("科长审批已通过");
			} else if ("7".equals(empvo.getFlag())) {
				empvo.setFlag("局长审批已通过");
			} else if ("8".equals(empvo.getFlag())) {
				empvo.setFlag("局长已驳回");
			}
		}
		return JSON.toJSONString(vo);
	}
	// 科员全部工作计划 条件查询
	@RequestMapping("/selectyear.a")
	@ResponseBody
	public String selectyear(empvo vo) {
		vo.setStarttime(StrUtil.getString(vo.getStarttime()));
		vo.setFlag(StrUtil.getInt(vo.getFlag()));		
		return JSON.toJSONString(empService.selectyear(vo));
	}
	// 科员全部工作计划 修改
	@RequestMapping("/updateplan.a")
	@ResponseBody
	public String updateplan(empvo vo) {
		System.out.println(vo);
		empService.updateplan(vo);
		return "1";
	}
	// 科员全部工作计划 删除
	@RequestMapping("/delete.a")
	@ResponseBody
	public String deleteplan(String only) {
		System.out.println(only);
		empService.deleteplan(only);
		return "1";
	}
	// msg
	@RequestMapping("/msg.a")
	@ResponseBody
	public String msg(int id) {
		return JSON.toJSONString(empService.selectmsg(id));
	}
	@RequestMapping("/curd.a")
	@ResponseBody
	public String curd(Plan p, String f) {
		if ("1".equals(f) || "2".equals(f) || "3".equals(f) || "4".equals(f)) {
			empService.curd(p);
			return "1";
		} else {
			return "0";
		}
	}
	// 提交状态查询
	@RequestMapping("/process.a")
	@ResponseBody
	public String process(int only) {
		return empService.process(only);
	}
	// 已完成页面
	@RequestMapping("/selectfileplan.a")
	@ResponseBody
	public String SelectFile(int id) {
		List<empvo> selectfileplan = empService.SelectFile(id);
		for (empvo empvo : selectfileplan) {
			if ("2".equals(empvo.getFlag())) {
				empvo.setFlag("已完结");
			}
		}
		return JSON.toJSONString(selectfileplan);
	}
	// File 归档页面
	@RequestMapping("/File.a")
	@ResponseBody
	public String File(int id) {
		List<empvo> File = empService.File(id);
		for (empvo empvo : File) {
			if ("5".equals(empvo.getFlag())) {
				empvo.setFlag("已归档");
			}
		}
		return JSON.toJSONString(File);
	}
	@RequestMapping("/Reject.a")
	@ResponseBody
	public String Reject(int only) {
		return JSON.toJSONString(empService.Reject(only));
	}
	@RequestMapping("/car.a")
	@ResponseBody
	public String car() {
		return JSON.toJSONString(empService.carall());
	}

}
