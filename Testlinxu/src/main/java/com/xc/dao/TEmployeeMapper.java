package com.xc.dao;

import com.xc.domain.TEmployee;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface TEmployeeMapper extends Mapper<TEmployee> {
    @Select("select * from t_employee where employee_name=#{employee_name} and password=#{password}")
    public TEmployee login(String employee_name, String password);


    @Select("select * from t_employee where parent_id =#{parent_id}")
    public List<TEmployee> selectpaid(Integer parent_id);
}
