package com.xc.service;

import com.xc.domain.TEmployee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TEmployeeservice {
    public boolean savaTEmployee(TEmployee tEmployee);

    public boolean deleteTEmployee(Integer id);

    public boolean updateTEmployee(TEmployee tEmployee);

    public PageInfo<TEmployee> findTEmployee(Integer page, Integer pageSize);

    public TEmployee findTEmployeeByid(Integer id);

    public TEmployee login(String employee_name, String password);

    public List<TEmployee> selectforname();

    public List<TEmployee> selectpaid(Integer parent_id);
}
