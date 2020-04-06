package com.xc.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * T_EMPLOYEE
 *
 * @author
 */
@Table(name = "t_employee")
public class TEmployee {
    //adds
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;
    private String employee_name;
    private String password;
    private String real_name;
    private String sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String duty;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date enrolldate;
    private String major;
    private Integer role_id;
    private String url;

    public TEmployee() {
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public Date getEnrolldate() {
        return enrolldate;
    }

    public void setEnrolldate(Date enrolldate) {
        this.enrolldate = enrolldate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TEmployee(String employee_name, String password, String real_name, String sex, Date birthday, String duty, Date enrolldate, String major, Integer role_id, String url) {
        this.employee_name = employee_name;
        this.password = password;
        this.real_name = real_name;
        this.sex = sex;
        this.birthday = birthday;
        this.duty = duty;
        this.enrolldate = enrolldate;
        this.major = major;
        this.role_id = role_id;
        this.url = url;
    }
}