package com.xc.service;

import com.xc.domain.Menu;

import java.util.List;

public interface MenuService {
 public List<Menu> findMenusByPid(Integer pid);
}
