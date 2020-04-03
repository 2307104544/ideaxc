package com.xc.service.impl;

import com.xc.dao.TRoleMapper;
import com.xc.domain.TRole;
import com.xc.service.TRoleservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TRoleserviceimpl implements TRoleservice {
    @Autowired
    private TRoleMapper tRoleMapper;
    @Override
    public List<TRole> findTRole() {
        List<TRole> list=this.tRoleMapper.selectAll();
        return list;
    }
}
