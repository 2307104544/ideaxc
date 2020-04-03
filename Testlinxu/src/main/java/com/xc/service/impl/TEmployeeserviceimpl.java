package com.xc.service.impl;

import com.xc.dao.TEmployeeMapper;
import com.xc.domain.TEmployee;
import com.xc.service.TEmployeeservice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TEmployeeserviceimpl implements TEmployeeservice {
    @Autowired
    private TEmployeeMapper tEmployeeMapper;

    @Override
    public boolean savaTEmployee(TEmployee tEmployee) {
        return this.tEmployeeMapper.insert(tEmployee) > 0 ? true : false;
    }

    @Override
    public boolean deleteTEmployee(Integer id) {
        return this.tEmployeeMapper.deleteByPrimaryKey(id) > 0 ? true : false;
    }

    @Override
    public boolean updateTEmployee(TEmployee tEmployee) {
        return this.tEmployeeMapper.updateByPrimaryKey(tEmployee) > 0 ? true : false;
    }

    @Override
    public PageInfo<TEmployee> findTEmployee(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List list=this.tEmployeeMapper.selectAll();
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public TEmployee findTEmployeeByid(Integer id) {
        return this.tEmployeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public TEmployee login(String employee_name, String password) {

        return this.tEmployeeMapper.login(employee_name, password);
    }

    @Override
    public List<TEmployee> selectforname() {
        List list=this.tEmployeeMapper.selectAll();
        return list;
    }

    @Override
    public List<TEmployee> selectpaid(Integer parent_id) {
        return this.tEmployeeMapper.selectpaid(parent_id);
    }
}
