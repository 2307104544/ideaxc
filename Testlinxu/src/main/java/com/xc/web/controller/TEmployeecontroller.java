package com.xc.web.controller;

import com.xc.domain.TEmployee;
import com.xc.domain.TRole;
import com.xc.dto.MsgDto;
import com.xc.service.TEmployeeservice;
import com.xc.service.TRoleservice;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("TEmployeesm")
@RestController
public class TEmployeecontroller {
    @Autowired
    private TEmployeeservice tEmployeeservice;
    @Autowired
    private TRoleservice tRoleservice;


    @RequestMapping("selecteper")
    public PageInfo<TEmployee> selecteper(Integer page, Integer pageSize){
        PageInfo<TEmployee> pageInfo=this.tEmployeeservice.findTEmployee(page, pageSize);
        return pageInfo;
    }


    @RequestMapping("selecteid")
    public TEmployee selecteid(Integer eids) {
        return this.tEmployeeservice.findTEmployeeByid(eids);
    }

    @RequestMapping("updateAtu")
    public MsgDto updateAtu(@RequestBody TEmployee tEmployee) {
        this.tEmployeeservice.updateTEmployee(tEmployee);
        return new MsgDto(true,"修改成功");
    }

    @RequestMapping("selecteidAtu")
    public TEmployee selecteidAtu(Integer eids) {
        return this.tEmployeeservice.findTEmployeeByid(eids);

    }

    @RequestMapping("deletee")
    public MsgDto deletee(Integer did) {
        this.tEmployeeservice.deleteTEmployee(did);
        return new MsgDto(true,"删除成功");
    }

    @RequestMapping("savae")
    public MsgDto savae(@RequestBody TEmployee temployee){
        this.tEmployeeservice.savaTEmployee(temployee);
        return new MsgDto(true,"添加成功");
    }

    @RequestMapping("login")
    public TEmployee login(String employee_name, String password){
        return this.tEmployeeservice.login(employee_name,password);
    }

    @RequestMapping("selecttr")
    public List<TRole> findselecttr(){
        List<TRole> list=this.tRoleservice.findTRole();
        return list;
    }

}
