package com.xc.web.controller;

import com.xc.domain.Menu;
import com.xc.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menu")
public class MenuController {
	@Autowired
	private MenuService menuService;
	
	@RequestMapping("find")
	public List<Menu> find(Integer pid){
		return this.menuService.findMenusByPid(pid);
	}

}
