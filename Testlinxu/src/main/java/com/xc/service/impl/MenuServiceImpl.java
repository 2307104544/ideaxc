package com.xc.service.impl;

import com.xc.dao.MenuMapper;
import com.xc.domain.Menu;
import com.xc.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class MenuServiceImpl  implements MenuService {
	@Autowired
	private MenuMapper menuDao;

	@Override
	public List<Menu> findMenusByPid(Integer pid) {

            Example example=new Example(Menu.class);
            example.createCriteria().andEqualTo("pid", pid);
		return this.menuDao.selectByExample(example);
	}

}
