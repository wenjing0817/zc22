package com.zy.project.controller;

import com.zy.project.pojo.Projects;
import com.zy.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProjectController {

	@Autowired
	private ProjectService service;


	@RequestMapping("/toProject")
	public String toProject(){
		return "project/project";
	}

	@RequestMapping("/project/getPro")
	@ResponseBody
	public Map<String,Object> getPro(){
		Map<String,Object> map = new HashMap<>();
		List<Projects> list = service.getPro();
		map.put("code",0);
		map.put("msg","项目数据");
		map.put("count",100);
		map.put("data",list);
		return  map;
	}
}
